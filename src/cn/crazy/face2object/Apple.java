package cn.crazy.face2object;

public class Apple extends Fruit{
	protected String name;
	protected String color;
	protected String weight;

	public Apple(){
		
	}
	
	public Apple(String name,String color,String weight){
		super(name,color,weight);//调用父类构造函数，必须放在第一行
		this.color = "Apple"+color;
		this.name = "Apple"+name;
		this.weight = "Apple"+weight;
	}
	
	public void love(){
		System.out.println("I love Apple");
	}
	public void print(){
		System.out.println("Fruit.color  "+super.color);//点取被子类隐藏的父类成员变量
		System.out.println("Apple.color  "+this.color);
		super.love();//点取被子类覆盖的方法
		this.love();
	}
}
