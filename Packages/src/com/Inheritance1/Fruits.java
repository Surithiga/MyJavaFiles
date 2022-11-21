package com.Inheritance1;

public class Fruits {
    private String name;
     private String color;
     private int kilo;


     Fruits(String name,String color, int kilo){
         this.name=name;
         this.color=color;
         this.kilo=kilo;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}
