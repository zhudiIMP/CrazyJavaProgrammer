package cn.crazy.thread.newthread;
//�̳�Thread���½��̵߳ķ�ʽ
public class SecondThread {
	public static void main(String[] args) {
		//�߳�mt1��mt2 ����mt����  �Լ�mt�е�i��Ա����
		//�̼̳߳�Thread��ķ�ʽ��ֱ��new��������
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