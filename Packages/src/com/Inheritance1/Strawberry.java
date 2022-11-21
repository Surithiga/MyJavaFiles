package com.Inheritance1;

public class Strawberry extends Fruits {
    private String taste;
    private int price;

    Strawberry(String name, String color, int kilo, String taste, int price ){
        super(name, color, kilo);
        this.taste=taste;
        this.price=price;
    }
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
