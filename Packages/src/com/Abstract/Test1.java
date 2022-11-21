package com.Abstract;

public class Test1 extends Animal {
    Test1 (String name,int noOfLegs){
        this.name=name;
        this.noOfLegs=noOfLegs;
    }

    @Override
    void create() {
        System.out.println("cat");
    }
 }

