package com.Abstract;

public class Run {
    public static void main(String[] args) {
        Test1 obj=new Test1("Rabbit",4);
        System.out.println(obj.name);
        System.out.println(obj.noOfLegs);
        obj .create();
        obj.animal();
    }

}
