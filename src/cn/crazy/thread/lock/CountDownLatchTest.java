package cn.crazy.thread.lock;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String args[]){
        CountDownLatch doneSignal = new CountDownLatch(5);
        System.out.println("main await begin.");
        for(int i = 0;i<5;i++){
            new Thread(new SubThread(doneSignal)).start();
        }
        try {
            doneSignal.await();
            System.out.println("main await finished.");
        }catch (Exception e){

        }

    }
}

class SubThread implements Runnable{
    CountDownLatch doneSignal;

    public SubThread(CountDownLatch doneSignal){
        this.doneSignal = doneSignal;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " sleep 1000ms.");
            doneSignal.countDown();
        }catch (Exception e){

        }


    }
}