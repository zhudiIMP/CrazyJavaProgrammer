package cn.crazy.face2object;
/*成员变量和类变量的访问*/
public class Persion {
	public static int eyeNum;
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info(){
		System.out.println("我的名字是："+this.name+":我的年龄是："+this.age+"；我的眼睛个数是："+Persion.eyeNum);
	}
	
	
}
