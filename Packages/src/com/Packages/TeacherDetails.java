package com.Packages;

public class TeacherDetails {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.setName("Vasumathi");
        obj.setQualification("M.sc,B.ed,Ph.d");
        obj.setaddress("Tnj");
        obj.setPhNo(958567);
        System.out.println(obj.getName());
        System.out.println(obj.getQualification());
        System.out.println(obj.getAddress());
        System.out.println(obj.getPhNo());
    }
}