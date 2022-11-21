package com.Method;

public class Animal {
    static String animal(String name, String colour, int noOfLegs){
        return name+" "+colour+" "+noOfLegs;
    }

    public static void animalDetails(String name1, String colour1, int noOfLegs1){
        System.out.println("Animal name1: " + name1 + " " + " colour1: " + colour1 + " " + " noOfLegs1: " + noOfLegs1);
    }

    public static void main(String[] args) {
        String s=animal("dog","black",4);
        System.out.println(s);

        animalDetails("cat","brown",4);
        animalDetails("Rabbit","white",4);
    }

}
