package cn.crazy.designpatterns.builder;

public class Director {
    public void construct(Builder builder){
        builder.buildColor();
        builder.buildSize();
    }
}
