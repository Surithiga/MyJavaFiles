package com.packages1;

public class BikeEx1 {
    public static void main(String[] args) {
        Bike bike1= new Bike("Royal Enfield","Bullet 350", "Black",200000);

        System.out.println(bike1.name);
        System.out.println(bike1.model);
        System.out.println(bike1.colour);
        System.out.println(bike1.price);

        bike1.name="Fz";
        System.out.println(bike1.name);
        bike1.model="Yamaha Fz x";
        System.out.println(bike1.model);
        bike1.colour="Blue";
        System.out.println(bike1.colour);
        bike1.price=250000;
        System.out.println(bike1.price);
    }
}
