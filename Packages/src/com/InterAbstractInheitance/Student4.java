package com.InterAbstractInheitance;

public class Student4 extends Student3 implements Student1{
    @Override
    public void details(String name, String department) {
        System.out.println(name);
        System.out.println(department);
    }

    @Override
    public void detail(String address, String degree) {
        System.out.println(address);
        System.out.println(degree);
    }
}
