package com.Abstract1;

public class Run {
    public static void main(String[] args) {
        Cricket1 obj=new Cricket1("Raina",57);
        System.out.println(obj.playerName);
        System.out.println(obj.score);
        obj.create();
        obj.cricket();
    }
}
