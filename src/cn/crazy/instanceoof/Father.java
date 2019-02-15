package cn.crazy.instanceoof;

public class Father implements Persion {

	private String name;
	
	public Father(String name){
		this.name = name;
	}
	public Father(){
		
	}
	public void sayName() {
		System.out.println("my name is"+this.name);
	}

}
