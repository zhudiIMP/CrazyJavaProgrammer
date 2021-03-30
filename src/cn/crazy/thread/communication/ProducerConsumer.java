package cn.crazy.thread.communication;

public class ProducerConsumer {
    public static void main(String[] args) {
        ProduceOrConsume poc = new ProduceOrConsume();
        Producer producer = new Producer(poc);
        Consumer consumer1 = new Consumer(poc);
        Consumer consumer2 = new Consumer(poc);

        Thread producerThread = new Thread(producer,"Producer");
        Thread consumerThread1 = new Thread(consumer1,"Consumer1");
        Thread consumerThread2 = new Thread(consumer2,"Consumer2");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}

class Producer implements Runnable {
    private ProduceOrConsume poc;

    Producer(ProduceOrConsume poc){
        this.poc = poc;
    }
    @Override
    public void run() {
        while(true){
            poc.produce();
        }
    }
}

class Consumer implements Runnable {
    private ProduceOrConsume poc;

    Consumer(ProduceOrConsume poc){
        this.poc = poc;
    }
    @Override
    public void run() {
        while(true){
            poc.consume();
        }
    }
}
class ProduceOrConsume {
    private int apple = 0;
    private final int MAX = 10;

    public void produce(){
        synchronized (this){
            while(apple == MAX){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            apple++;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer:"+Thread.currentThread()+",produced one apple,now left:"+apple+" apples");
            this.notifyAll();
        }
    }

    public void consume(){
        synchronized (this){
            while(apple == 0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            apple--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consumer:"+Thread.currentThread()+",eat one apple,now left:"+apple+" apples");
            this.notifyAll();
        }
    }
}
