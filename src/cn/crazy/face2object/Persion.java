package cn.crazy.face2object;
/*��Ա������������ķ���*/
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
		System.out.println("�ҵ������ǣ�"+this.name+":�ҵ������ǣ�"+this.age+"���ҵ��۾������ǣ�"+Persion.eyeNum);
	}
	
	
}
