package cn.crazy.forwhileifswitch;

public class Switch {
	public static void main(String[] args) {
		String str = "123";
		switch(str){
			case "123":
				System.out.println("123");
				break;
			case "321":
				System.out.println("321");
				break;
			case "213":
				System.out.println("213");
				break;
			default:
				System.out.println("default");
		}
	}
}
