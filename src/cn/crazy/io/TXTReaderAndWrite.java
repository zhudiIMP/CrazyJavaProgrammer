package cn.crazy.io;

import java.io.*;
import java.util.*;

public class TXTReaderAndWrite {
	private final static String sourceFilePath="D:"+File.separator+"workspaceStudy"+File.separator+"CrazyJavaProgrammer"+File.separator+"src"+File.separator+"cn"+File.separator+"crazy"+File.separator+"io"+File.separator+"file.txt";
	private final static String targetFilePath="D:"+File.separator+"workspaceStudy"+File.separator+"CrazyJavaProgrammer"+File.separator+"src"+File.separator+"cn"+File.separator+"crazy"+File.separator+"io"+File.separator+"target.txt";
	private final static String encoding="GBK";
	private static ArrayList<String> readList = new ArrayList<String>();
	
    public static void readTxtFile(){ 
    	BufferedReader bufferedReader = null;
        try { 
                File file=new File(TXTReaderAndWrite.sourceFilePath); 
                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ���� 
                    bufferedReader = new BufferedReader(
                    		new InputStreamReader(//�ֽڵ��ַ�������
                    				new FileInputStream(file),TXTReaderAndWrite.encoding)); 
                    String lineTxt = null; 
                    while((lineTxt = bufferedReader.readLine()) != null){ 
                    	TXTReaderAndWrite.readList.add(lineTxt);
                    } 
                }else{ 
                	System.out.println("�Ҳ���ָ�����ļ�"); 
                } 
        	} catch (Exception e) { 
        		System.out.println("��ȡ�ļ����ݳ���"); 
        		e.printStackTrace(); 
        	}finally{
        		if(bufferedReader!=null){
        			try {
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
        		}
        	}
    } 
    public static void writeTxtFile(){
    	BufferedWriter bw = null;
    	try{
    		File file=new File(TXTReaderAndWrite.targetFilePath); 
    		if(!file.exists()){
    			file.createNewFile();
    		}
    		bw = new BufferedWriter(
    				new OutputStreamWriter(//�ֽڵ��ַ�������
    						new FileOutputStream(file),TXTReaderAndWrite.encoding));
    		Iterator it = TXTReaderAndWrite.readList.iterator();
    		while(it.hasNext()){
    			bw.write(it.next().toString());
    			bw.newLine();
    		}
    		bw.flush();
    		bw.close();
    	}catch(Exception e) { 
    		System.out.println("��ȡ�ļ����ݳ���"); 
    		e.printStackTrace(); 
    	}finally{
    		if(bw!=null){
    			try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    	}
    }
	public static void main(String[] args) {
		TXTReaderAndWrite.readTxtFile();
		TXTReaderAndWrite.writeTxtFile();
		
	}
}
