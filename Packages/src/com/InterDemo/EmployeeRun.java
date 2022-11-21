package com.InterDemo;

public class EmployeeRun {
    public static void main(String[] args) {
        ABCEmployee obj=new ABCEmployee();
        obj.maintainHours();
        obj.report();
        obj.dressCode();
        obj.relocate();

        System.out.println(obj.salary);
        System.out.println(obj.holidays);
    }
}
