package cn.crazy.face2object;
/*���ֳ�ʼ�������ڱ���ʱ������ڹ������н��г�ʼ�����������캯����ʼ�����������*/
public class Cat{
	private int age;
	private String name;
	public Cat(){
		
	}
	
	public Cat(int age){
		this.age = age;
	}
	//���캯����ʼ��
	public Cat(int age,String name){
		this(age);
		System.out.println("-----ִ�й��췽��-----");
		this.name = name;
	}
	//��̬��ʼ����
	{
		System.out.println("-----ִ�зǾ�̬��ʼ����-----");
		weight = 2.1;
	}
	//����ʱ��ʼ��
	private double weight = 3.2;
	
	public String toString(){
		return "Cat--->name="+name+";age="+age+";weight="+weight;
	}
}
