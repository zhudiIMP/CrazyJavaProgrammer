package cn.crazy.utils;

import java.util.Random;

public class RandomCode {
	
	/**
	*功能：随机生成优惠码
	*@author iamwiam
	*
	*/
	public static void main(String[] args) {
		int ACTIVATEDCODENUM = 3000; //生成的优惠码数量
	    Random random = new Random();
	    String candicatedCode = "abcedefghijklmnopqrstuvwxyz";//优惠码包含小写字母
	    candicatedCode+=candicatedCode.toUpperCase();//优惠码包含大写字母
	    candicatedCode+="1234567890";//优惠码包含阿拉伯数字
	    for(int i=0; i< ACTIVATEDCODENUM;i++){
	        String res ="";
	        for(int j=0;j<8;j++){
	            res+=candicatedCode.charAt(random.nextInt(candicatedCode.length()));
	        }
	        System.out.println(res);//随机生成200个8位的优惠码
	    }
	}
}
