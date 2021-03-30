package cn.crazy.generics;

public class GenericsMethod {

    public <T1, T2> T2 genericsMethod(T1 t1,T2 t2) {
        return t2;
    }

    public static void main(String[] args){
        GenericsMethod gm = new GenericsMethod();
        System.out.println(gm.genericsMethod(12,"this is genericsMethod test"));

    }
}
