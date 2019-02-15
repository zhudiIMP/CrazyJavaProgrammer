package cn.crazy.abstractclass;

public abstract class Persion {
	protected String name;
	protected int age;
	protected String address;
	
	{
		this.name = "David";
	}
	
	public enum Weekday {
	    SUN,MON,TUS,WED,THU,FRI,SAT
	}
	
	public Persion(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public abstract void introduceYourself();
}
