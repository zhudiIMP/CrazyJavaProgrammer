package cn.crazy.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BaseService {
	
	public void readFile() throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream("");
	}
	
	public void readMyFile() throws FileNotFoundException{
		readFile();
	}
	public static void main(String[] args) {
		BaseService bs = new BaseService();
		try {
			System.out.println("before_readMyFile");
			bs.readMyFile();
			System.out.println("after_readMyFile");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (Exception e){
			System.out.println("Exception");
		}finally{
			System.out.println("finally");
		}
		System.out.println("after_try_catch");
	}
}
