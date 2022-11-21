package com.InterDemo;

public class ABCEmployee implements EmployeeRules{

    public void maintainHours(){
        System.out.println("40Hours");
    }
    public void report(){

        System.out.println("Manager");
    }
    public void dressCode(){
        System.out.println("Neatly");
    }
    public void relocate(){
        System.out.println("City");
    }
}
