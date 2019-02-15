package cn.crazy.collections;


import java.util.*;


public class TestHashMap {
	public static void forKeySet(HashMap map){
		 System.out.println("(for)通过Map.keySet遍历key和value：");  
		for(Object i : map.keySet()){
			System.out.println("key--"+(int)i+"   value---"+(Persion)map.get((int)i));
		}
	}
	
	public static void iteratorKeySet(HashMap map){
		 System.out.println("(Iterator)通过Map.keySet遍历key和value：");  
		Iterator iterKey = map.keySet().iterator();
		while (iterKey.hasNext()) {
			int key = (int) iterKey.next();
			System.out.println("key--"+key+"   value---"+(Persion)map.get(key));
		}
	}
	
	public static void forEntrySet(HashMap map){
		System.out.println("(for)通过Map.entrySet遍历key和value");  
		for (Object entry : map.entrySet()) {  
		    System.out.println("key= " + ((Map.Entry)entry).getKey() + " and value= " + ((Map.Entry)entry).getValue());  
		}  
	}
	
	public static void iteratorEntrySet(HashMap map){
		System.out.println("(Iterator)通过Map.entrySet遍历key和value"); 
		Iterator iterEntry = map.entrySet().iterator();
		while (iterEntry.hasNext()) {
			Map.Entry entry = (Map.Entry) iterEntry.next();
			System.out.println("key--"+entry.getKey()+"   value---"+(Persion)entry.getValue());
		}
	}
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		for(int i=0;i<=2;i++){
			Persion p = new Persion();
			p.setId(i);
			p.setAge(10+i);
			p.setName("jim"+i);
			map.put(i, p);
		}
		//HashMap遍历
//		TestHashMap.forKeySet(map);
//		TestHashMap.iteratorKeySet(map);
//		TestHashMap.forEntrySet(map);
//		TestHashMap.iteratorEntrySet(map);
		
		System.out.println(map.values());
	}
}
