package cn.crazy.instanceoof;

public class Jim extends Father{
	private String name;
	
	public Jim(String name){
		this.name = name;
	}
	
	public Jim(){
		
	}

	public void sayName(){
		System.out.println("my name is"+this.name);
	}
}
