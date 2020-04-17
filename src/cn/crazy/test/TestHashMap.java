package cn.crazy.test;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] strs){
        HashMap<String,String> hugeMap = new HashMap();
        for(int i=0;i<=900000;i++){
            hugeMap.put("abc"+i,"bca"+i);
            hugeMap.get("abc"+i);
        }
        System.out.println(hugeMap.get("abc999"));
        System.out.println(hugeMap.size());
    }
}
