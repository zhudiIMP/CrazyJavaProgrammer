package cn.crazy.test;

import java.util.*;

public class Test01 {
	private int i;
	private String str;

	public int str(){
		int i = 0;
		int p;
		String[] str = new String[]{"123"};
		{
			int k;
		}
		System.out.println();
		return this.i;
	}

	public void abc(List list){
		list.add("321");
		System.out.println(list);
		list = null;
		System.out.println(list);
	}
	public static void main(String[] args) {
		Test01 test01 = new Test01();
//		int i = test01.str();
//		System.out.println(i);
		ArrayList list = new ArrayList();
		list.add("123");
		test01.abc(list);
		System.out.println(list);
	}
}
