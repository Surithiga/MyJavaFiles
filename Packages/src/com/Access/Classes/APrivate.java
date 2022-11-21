package com.Access.Classes;

public class APrivate {
    private class Shadows{

        void display(){
            System.out.println("black");
        }
    }
    void displayinner(){
        Shadows obj=new Shadows();
        obj.display();
    }
}
