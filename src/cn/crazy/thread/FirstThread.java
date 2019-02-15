package cn.crazy.thread;
//实现runnable接口方式新建线程
public class FirstThread {
	public static void main(String[] args) {
		//线程t1和t2 共享mt对象  以及mt中的i成员变量
		//将实现runnable接口的线程类new出来，然后作为参数new一个线程
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		//调用线程对象的start启动线程，不能调用run方法，线程的run方法不能主动调用！！
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread implements Runnable{
	int i = 0;
	@Override
	public void run() {
		for(;i<50;i++){
			System.out.println("i==="+i+"name=="+Thread.currentThread().getName());
		}
	}
	
}