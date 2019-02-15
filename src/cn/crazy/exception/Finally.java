package cn.crazy.exception;

public class Finally {
	public int finallyAndReturn(){
		int count = 5;
		try{
			return count++;
		}finally{
			System.out.println("finally");
			return ++count;
		}
	}
	public static void main(String[] args) {
		Finally finallyObj = new Finally();
		System.out.println("count:"+finallyObj.finallyAndReturn());
	}
}
