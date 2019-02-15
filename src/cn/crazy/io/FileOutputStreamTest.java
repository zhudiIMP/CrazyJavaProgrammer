package cn.crazy.io;

import java.io.*;

public class FileOutputStreamTest {
	private final static String targetFilePath="D:"+File.separator+"workspaceStudy"+File.separator+"CrazyJavaProgrammer"+File.separator+"src"+File.separator+"cn"+File.separator+"crazy"+File.separator+"io"+File.separator+"target.txt";
	
	public static void test(){
		try {
			File file = new File(FileOutputStreamTest.targetFilePath);
			FileOutputStream fos = new FileOutputStream(file);
			if(!file.exists()){
				file.createNewFile();
			}
			String str = "ºÃºÃ¸É";
			fos.write(str.getBytes("UTF-8"));
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileOutputStreamTest.test();
	}
}
