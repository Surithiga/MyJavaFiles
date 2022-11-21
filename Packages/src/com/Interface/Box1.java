package com.Interface;

public class Box1 implements Box {
    public void add(int length, int breadth, int height) {
        int c = length + breadth + height;
        System.out.println(c);
    }

    public void sub(int length, int breadth, int height) {
        int c = length - breadth - height;
        System.out.println(c);

    }
}