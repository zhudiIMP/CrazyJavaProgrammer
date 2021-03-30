package cn.crazy.designpatterns.builder;

public class UserClient {
    public static void main(String[] args){
        Builder builderA = new BuilderA();
        Director director = new Director();
        director.construct(builderA);
        Product product = builderA.getProduct();

        System.out.println(product.toString());
    }
}
