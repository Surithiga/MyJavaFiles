package com.Inheritance1;

public class Run {
    public static void main(String[] args) {
        Strawberry obj=new Strawberry("Strawberry","Red",1,"Sour",200);
        System.out.println(obj.getName());
        System.out.println(obj.getColor());
        System.out.println(obj.getKilo());
        System.out.println(obj.getTaste());
        System.out.println(obj.getPrice());
    }
}
