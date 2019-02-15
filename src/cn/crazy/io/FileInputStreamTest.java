package cn.crazy.io;

import java.io.*;

public class FileInputStreamTest {
	private final static String sourceFilePath="D:"+File.separator+"workspaceStudy"+File.separator+"CrazyJavaProgrammer"+File.separator+"src"+File.separator+"cn"+File.separator+"crazy"+File.separator+"io"+File.separator+"file.txt";
	
	public static void test(){
		try {
			File file = new File(FileInputStreamTest.sourceFilePath);
			FileInputStream fis = new FileInputStream(file);
			byte[] b = new byte[1024];
			fis.read(b);
			System.out.println(new String(b,"GBK"));
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FileInputStreamTest.test();
	}
}
