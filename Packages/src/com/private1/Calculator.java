package com.private1;

public class Calculator {
    private int calc1;
    private int calc2;

    Calculator(int calc1, int calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    public int getCalc1() {
        return calc1;
    }

    public void setCalc1(int calc1) {
        this.calc1 = calc1;
    }

    public int getCalc2() {
        return calc2;
    }

    public void setCalc2(int calc2) {
        this.calc2 = calc2;
    }

    public void addition() {
        System.out.println(calc1 + calc2);
    }

    public void subtraction() {
        System.out.println(calc1 - calc2);
    }

    public void multiple() {
        System.out.println(calc1 * calc2);

    }
    public void division(){
        System.out.println(calc1/calc2);
    }
}
