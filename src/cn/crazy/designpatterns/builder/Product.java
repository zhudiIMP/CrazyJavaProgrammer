package cn.crazy.designpatterns.builder;

public class Product {
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
