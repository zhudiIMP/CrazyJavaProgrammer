package cn.crazy.abstractclass;

public class Jim extends Persion{

	public Jim(String name, int age, String address) {
		super(name, age, address);
	}

	@Override
	public void introduceYourself() {
		System.out.println("My name is "+super.name+" I'm "+super.age+" I lived in "+super.address);
	}

}
