package com.Protected;

public class Third extends Parent {
    public static void main(String[] args) {
        Parent obj=new Third();
        System.out.println(obj.name);
        obj.printDegree();
    }
}
