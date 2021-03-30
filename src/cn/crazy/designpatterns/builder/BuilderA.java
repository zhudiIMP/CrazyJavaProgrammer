package cn.crazy.designpatterns.builder;

public class BuilderA extends Builder{
    private Product product = new Product();
    public void buildSize(){
        product.setSize("250");
    }
    public void buildColor(){
        product.setColor("red");
    }

    public Product getProduct(){
        return product;
    }
}
