package cn.crazy.face2object;

public class Fruit {
	protected String name;
	protected String color;
	protected String weight;
	
	public Fruit(){
		
	}
	
	public Fruit(String name,String color,String weight){
		this.color = color;
		this.name = name;
		this.weight = weight;
	}
	
	public void love(){
		System.out.println("I love Fruit");
	}

	
	
	
}
