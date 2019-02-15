package cn.crazy.io;

import java.io.*;

public class ObjectSerializ {
	private final static String sourceFilePath="D:"+File.separator+"workspaceStudy"+File.separator+"CrazyJavaProgrammer"+File.separator+"src"+File.separator+"cn"+File.separator+"crazy"+File.separator+"io"+File.separator+"object.txt";
	
	public static void writeObject(){
		ObjectOutputStream oos = null;
		File file = new File(ObjectSerializ.sourceFilePath);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try{
			oos = new ObjectOutputStream(
					new FileOutputStream(file));
			Person p = new Person("wang",12,"xiaoshou");
			oos.writeObject(p);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
	
	public static void readObject(){
		ObjectInputStream ois = null;
		File file = new File(ObjectSerializ.sourceFilePath);
		try{
			ois = new ObjectInputStream(
					new FileInputStream(file));
			Person p = (Person)ois.readObject();
			System.out.println(p.toString());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ObjectSerializ.writeObject();
		ObjectSerializ.readObject();
	}
}
