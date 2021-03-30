package cn.crazy.generics;

public class GenericsClass<A,B> {
    private A a;
    private B b;

    public GenericsClass(A a,B b){
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ExampleTwo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) throws Exception{
        GenericsClass<Integer,String> gc = new GenericsClass<>(12,"test");
        System.out.println(gc.toString());
    }
}
