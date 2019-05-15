package cn.crazy.thread.synchronize;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumer {

    public static void main(String[] args) {
        Depot depot = new Depot();
        Producer producer = new Producer(depot);
        Consumer consumer = new Consumer(depot);
        Producer producer1 = new Producer(depot);
        Consumer consumer1 = new Consumer(depot);
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(producer1).start();
        new Thread(consumer1).start();
    }
}

class Producer implements Runnable {
    private Depot depot;

    public Producer(Depot depot){
        this.depot = depot;
    }
    @Override
    public void run(){
        while(true) {
            synchronized (depot) {
                while (depot.getQueue().size() == depot.getMax_size()) {
                    System.out.println("��ǰ������");
                    try {
                        depot.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                depot.getQueue().add(1);
                depot.notifyAll();
                System.out.println("������:"+Thread.currentThread().getName()+"����һ�����񣬵�ǰ���г���Ϊ" + depot.getQueue().size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Consumer implements Runnable {
    private Depot depot;

    public Consumer(Depot depot){
        this.depot = depot;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (depot) {
                while (depot.getQueue().size() == 0) {
                    System.out.println("��ǰ����Ϊ��");
                    try {
                        depot.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                depot.getQueue().poll();
                depot.notifyAll();
                System.out.println("������:"+Thread.currentThread().getName()+"����һ�����񣬵�ǰ���г���Ϊ" + depot.getQueue().size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Depot {
    private int max_size = 2;
    private Queue<Integer> queue = new LinkedList<Integer>();

    public int getMax_size() {
        return max_size;
    }

    public void setMax_size(int max_size) {
        this.max_size = max_size;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }
}
