package cn.crazy.designpatterns.builder;

public abstract class Builder {
    public abstract void buildSize();
    public abstract void buildColor();
    public abstract Product getProduct();
}
