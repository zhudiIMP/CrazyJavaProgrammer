package cn.crazy.face2object;

public class Client {
	public static void main(String[] args){
		//��Ա������������ķ���
		Persion p1 = new Persion();
		p1.setAge(12);
		p1.setName("Jim");
		p1.eyeNum = 3;
		p1.info();
		Persion p2 = new Persion();
		Persion.eyeNum=2;
		p2.setAge(14);
		p2.setName("Tom");
		p2.info();
		//���ֳ�ʼ�������ڱ���ʱ������ڹ������н��г�ʼ�����������캯����ʼ�����������
		Cat cat1 = new Cat(12,"Jim");
		System.out.println(cat1);
		Cat cat2 = new Cat(13,"Tom");
		System.out.println(cat2);
		//�������ʼ��
		System.out.println("count�������ֵ��"+Price.count);
		System.out.println("name�������ֵ��"+Price.name);
		
	}
}
