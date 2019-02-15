package cn.crazy.thread;
/*
 * ��ʾ sleep��yield��interrupt����
 * sleep �� yield ����������
 * 1:sleep������ʹ�߳̽�������״̬��yield��ʹ�߳̽������״̬
 * 2:sleep��������̵߳����ȼ�����yieldֻ���ø����ȼ���ͬ��ϸߵ��߳�ִ��
 * 3:sleep����������ʾ����InterruptedException���������׳�����yield����
 * 
 * interrupt�������
 * �÷��������������̵߳�interrupt flag.
*/
public class Schedule {
	public static void main(String[] args) {
		Runner3 r = new Runner3();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			//���߳�����2000��������t1��interrupt�������ѻ������ߵ�t1�߳�,t1�߳�ִ����Ϻ󣬵�5000����ʱt2���߽���������ִ������Ĵ���
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();

//		Runner4 r4 = new Runner4(true);
//		Runner4 r5 = new Runner4(false);
//		Thread t3 = new Thread(r4);
//		Thread t4 = new Thread(r5);
//		//�����̵߳����ȼ�
//		t3.setPriority(5);
//		t4.setPriority(5);
//		
//		t3.start();
//		t4.start();
	}
}
//Runner3������ʾsleep������interrupt����
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
//Runner4������ʾyield����
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