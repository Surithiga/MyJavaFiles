package com.Inheritance;

public class Animal{
    private String name;
    private String colour;
    private int noOfLegs;


    Animal(String name,String colour, int noOfLegs){
        this.name=name;
        this.colour=colour;
        this.noOfLegs=noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void printEat(){
        System.out.println("dog licking selvi sister");
    }
}


