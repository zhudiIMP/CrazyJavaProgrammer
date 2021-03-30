package cn.crazy.reflect;

import java.lang.reflect.Method;

public class RelfectTest {

    public final int num = 3;
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("cn.crazy.reflect.RelfectTest");
        Method[] methods = clazz.getMethods();
        System.out.println("getMethods获取的方法：");
        for(Method m:methods) {
            System.out.println(m);
        }
        //获取methodClass类的add方法
        Method method = clazz.getMethod("add", int.class, int.class);
        //调用method对应的方法 => add(1,4)
        RelfectTest rt = (RelfectTest)clazz.newInstance();
        Object result = method.invoke(rt,1,4);
        System.out.println("调用method对应的方法 => add(1,4)="+result);
    }
}
