package cn.crazy.thread;
/*
 * 演示 sleep，yield和interrupt方法
 * sleep 和 yield 方法的区别
 * 1:sleep方法会使线程进入阻塞状态，yield会使线程进入就绪状态
 * 2:sleep不会理会线程的优先级，而yield只会让给优先级相同或较高的线程执行
 * 3:sleep方法必须显示捕获InterruptedException或者主动抛出，而yield则不用
 * 
 * interrupt方法详解
 * 该方法就是设置了线程的interrupt flag.
*/
public class Schedule {
	public static void main(String[] args) {
		Runner3 r = new Runner3();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			//主线程休眠2000毫秒后调用t1的interrupt方法唤醒还在休眠的t1线程,t1线程执行完毕后，到5000毫秒时t2休眠结束，继续执行下面的代码
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();

//		Runner4 r4 = new Runner4(true);
//		Runner4 r5 = new Runner4(false);
//		Thread t3 = new Thread(r4);
//		Thread t4 = new Thread(r5);
//		//设置线程的优先级
//		t3.setPriority(5);
//		t4.setPriority(5);
//		
//		t3.start();
//		t4.start();
	}
}
//Runner3用于演示sleep方法和interrupt方法
class Runner3 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println( "Thread interrupted..." );
		}
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()
					+"==== No.==="+i);
		}
	}
	
}
//Runner4用于演示yield方法
class Runner4 implements Runnable{
	private boolean flag = false;
	public Runner4(boolean flag){
		this.flag = flag;
	}
	public void run() {
		if(flag){
			System.out.println(Thread.currentThread().getName()+" is yield");
			Thread.yield();
		}
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()
					+"==== No.==="+i);
		}
	}
	
}