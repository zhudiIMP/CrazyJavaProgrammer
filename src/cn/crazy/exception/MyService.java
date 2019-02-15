package cn.crazy.exception;

public class MyService extends BaseService{
	public void divisionByZero(){
		int i = 5/0;
	}
	
	public void myDivisionByZero(){
		this.divisionByZero();
	}
	public static void main(String[] args) {
		MyService myService = new MyService();
		try{
			myService.myDivisionByZero();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
