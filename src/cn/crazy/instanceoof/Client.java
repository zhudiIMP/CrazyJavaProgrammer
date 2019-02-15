package cn.crazy.instanceoof;

public class Client {

	public static void main(String[] args) {
		Father father = new Father("Father");
		Jim jim = new Jim("Jim");
		
		System.out.println("father instanceof Persion:"+(father instanceof Persion));
		System.out.println("jim instanceof Persion:"+(jim instanceof Persion));
		System.out.println("jim instanceof Father:"+(jim instanceof Father));
	}
}
