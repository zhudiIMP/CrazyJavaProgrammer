package cn.crazy.face2object;

public class Apple extends Fruit{
	protected String name;
	protected String color;
	protected String weight;

	public Apple(){
		
	}
	
	public Apple(String name,String color,String weight){
		super(name,color,weight);//���ø��๹�캯����������ڵ�һ��
		this.color = "Apple"+color;
		this.name = "Apple"+name;
		this.weight = "Apple"+weight;
	}
	
	public void love(){
		System.out.println("I love Apple");
	}
	public void print(){
		System.out.println("Fruit.color  "+super.color);//��ȡ���������صĸ����Ա����
		System.out.println("Apple.color  "+this.color);
		super.love();//��ȡ�����า�ǵķ���
		this.love();
	}
}
