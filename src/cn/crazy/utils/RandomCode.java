package cn.crazy.utils;

import java.util.Random;

public class RandomCode {
	
	/**
	*���ܣ���������Ż���
	*@author iamwiam
	*
	*/
	public static void main(String[] args) {
		int ACTIVATEDCODENUM = 3000; //���ɵ��Ż�������
	    Random random = new Random();
	    String candicatedCode = "abcedefghijklmnopqrstuvwxyz";//�Ż������Сд��ĸ
	    candicatedCode+=candicatedCode.toUpperCase();//�Ż��������д��ĸ
	    candicatedCode+="1234567890";//�Ż����������������
	    for(int i=0; i< ACTIVATEDCODENUM;i++){
	        String res ="";
	        for(int j=0;j<8;j++){
	            res+=candicatedCode.charAt(random.nextInt(candicatedCode.length()));
	        }
	        System.out.println(res);//�������200��8λ���Ż���
	    }
	}
}
