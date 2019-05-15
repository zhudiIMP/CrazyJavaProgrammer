package cn.crazy.thread.newthread;
//继承Thread的新建线程的方式
public class SecondThread {
	public static void main(String[] args) {
		//线程mt1和mt2 共享mt对象  以及mt中的i成员变量
		//线程继承Thread类的方式，直接new出来就行
		Thread mt1 = new MyThread2();
		Thread mt2 = new MyThread2();
		mt1.start();
		mt2.start();
	}
}
class MyThread2 extends Thread{
	int i = 0;
	@Override
	public void run() {
		for(;i<500;i++){
			System.out.println("i==="+i+"  name=="+Thread.currentThread().getName());
		}
	}
}