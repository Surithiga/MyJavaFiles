package com.OverRiding;

public class Orange extends Fruit {
    @Override
    void run() {
        System.out.println("Orange have nutrients");
    }

    public static void main(String[] args) {
        Orange obj=new Orange();
        obj.run();
    }
}

