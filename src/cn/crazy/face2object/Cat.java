package cn.crazy.face2object;
/*三种初始化方法在编译时都会放在构造器中进行初始化变量，构造函数初始化语句放在最后*/
public class Cat{
	private int age;
	private String name;
	public Cat(){
		
	}
	
	public Cat(int age){
		this.age = age;
	}
	//构造函数初始化
	public Cat(int age,String name){
		this(age);
		System.out.println("-----执行构造方法-----");
		this.name = name;
	}
	//静态初始化块
	{
		System.out.println("-----执行非静态初始化块-----");
		weight = 2.1;
	}
	//定义时初始化
	private double weight = 3.2;
	
	public String toString(){
		return "Cat--->name="+name+";age="+age+";weight="+weight;
	}
}
