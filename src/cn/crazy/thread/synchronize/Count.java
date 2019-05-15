package cn.crazy.thread.synchronize;

public class Count {
    public synchronized void synMethod1() {
        try {
             for (int i = 0; i < 5; i++) {
                 Thread.sleep(100); // ÐÝÃß100ms
                 System.out.println(Thread.currentThread().getName() + " synMethod loop " + i);
             }
        } catch (InterruptedException ie) {

        }
    }

    public synchronized void synMethod2() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100); // ÐÝÃß100ms
                System.out.println(Thread.currentThread().getName() + " synMethod loop " + i);
            }
        } catch (InterruptedException ie) {

        }
    }

    public void synBloMethod(){
        synchronized(this){
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(100); // ÐÝÃß100ms
                    System.out.println(Thread.currentThread().getName() + " synMethod loop " + i);
                }
            } catch (InterruptedException ie) {

            }
        }
    }
    public void nonSynMethod() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100); // ÐÝÃß100ms
                System.out.println(Thread.currentThread().getName() + " synMethod loop " + i);
            }
        } catch (InterruptedException ie) {

        }
    }
}
