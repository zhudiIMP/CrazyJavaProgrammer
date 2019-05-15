package cn.crazy.thread.synchronize;

public class Demo1 {
    public static void main(String[] args){
        Count connt = new Count();
        Thread t1 = new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        connt.synMethod1();
                    }
                },"t1");

        Thread t2 = new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        connt.synMethod2();
                    }
                },"t2");

        t1.start();
        t2.start();
    }
}
