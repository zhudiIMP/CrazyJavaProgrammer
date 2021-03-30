package cn.crazy.designpatterns.builder;

public class BuilderB extends Builder{
    private Product product = new Product();

    public void buildSize(){
        product.setSize("300");
    }
    public void buildColor(){
        product.setColor("blue");
    }

    public Product getProduct(){
        return product;
    }
}
