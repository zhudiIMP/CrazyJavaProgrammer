package cn.crazy.thread.join;

public class JoinTest{

    public static void main(String[] args){
        try {
            ThreadA t1 = new ThreadA("t1"); // �½����߳�t1��

            t1.start();// �������߳�t1��
            t1.join();// �����߳�t1�����뵽�����߳�main���У����ҡ����߳�main()��ȴ�������ɡ�
            System.out.printf("%s finish\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class ThreadA extends Thread{

        public ThreadA(String name){
            super(name);
        }
        public void run(){
            System.out.printf("%s start\n", this.getName());

            // ��ʱ����
            for(int i=0; i <1000000; i++);
            System.out.printf("%s finish\n", this.getName());
        }
    }
}