package cn.crazy.forwhileifswitch;

import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		//foreach遍历数组
		String[] str = new String[]{"1","2","3","4"};
		for(Object o : str){
			System.out.println(o);
		}
		//foreach遍历集合
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");		
		for(Object o : list){
			System.out.println(o);
		}
	}
}
