package cn.crazy.thread;
//ʵ��runnable�ӿڷ�ʽ�½��߳�
public class FirstThread {
	public static void main(String[] args) {
		//�߳�t1��t2 ����mt����  �Լ�mt�е�i��Ա����
		//��ʵ��runnable�ӿڵ��߳���new������Ȼ����Ϊ����newһ���߳�
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		//�����̶߳����start�����̣߳����ܵ���run�������̵߳�run���������������ã���
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