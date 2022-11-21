package com.Access.Properties;

public class APrivateExampleWorking {
    public static void main(String[] args) {
        APrivate aPrivate=new APrivate();
        System.out.println(aPrivate.getName());

        aPrivate.setName("Surithi");
        System.out.println(aPrivate.getName());
    }
}
