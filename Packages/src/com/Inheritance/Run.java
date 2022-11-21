package com.Inheritance;

public class Run {
    public static void main(String[] args) {
        Dog dog=new Dog("dog","black",4,"Siberian Husky","barking");
        System.out.println(dog.getName());
        System.out.println(dog.getColour());
        System.out.println(dog.getNoOfLegs());
        System.out.println(dog.getBreed());
        System.out.println(dog.getSound());

        dog.printEat();
    }
}
