package com.Package1;

public class StudentDetails {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setName("Surithi");
        obj.setDepartment("Physics");
        obj.setCity("Ond");
        System.out.println(obj.getName());
        System.out.println(obj.getDepartment());
        System.out.println(obj.getCity());
    }
}
