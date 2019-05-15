package cn.crazy.thread.lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    public static void main(String args[]){
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
        depot.getLock().lock();
        try{
            while(true) {
                while (depot.getQueue().size() == depot.getMax_size()) {
                    System.out.println("当前队列满");
                    depot.getFullCondtion().await();
                }
                depot.getQueue().add(1);
                depot.getEmptyCondtion().signalAll();
                System.out.println("生产者:"+Thread.currentThread().getName()+"生产一条任务，当前队列长度为" + depot.getQueue().size());
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            depot.getLock().unlock();
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
        depot.getLock().lock();
        try{
            while(true) {
                while (depot.getQueue().size() == 0) {
                    System.out.println("当前队列为空");
                    depot.getEmptyCondtion().await();
                }
                depot.getQueue().poll();
                depot.getFullCondtion().signalAll();
                System.out.println("消费者:"+Thread.currentThread().getName()+"消费一条任务，当前队列长度为" + depot.getQueue().size());
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            depot.getLock().unlock();
        }
    }
}

class Depot {
    private int max_size = 2;
    private Queue<Integer> queue = new LinkedList<Integer>();

    private Lock lock = new ReentrantLock();// 独占锁
    private Condition fullCondtion = lock.newCondition(); // 生产条件
    private Condition emptyCondtion = lock.newCondition();// 消费条件

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

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Condition getFullCondtion() {
        return fullCondtion;
    }

    public void setFullCondtion(Condition fullCondtion) {
        this.fullCondtion = fullCondtion;
    }

    public Condition getEmptyCondtion() {
        return emptyCondtion;
    }

    public void setEmptyCondtion(Condition emptyCondtion) {
        this.emptyCondtion = emptyCondtion;
    }
}
