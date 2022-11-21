package com.Inheritance;

public class Dog extends Animal{
    private String breed;
    private String sound;

    Dog( String name, String colour, int noOfLegs,String breed, String sound){
        super(name, colour, noOfLegs);
        this.breed=breed;
        this.sound=sound;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

