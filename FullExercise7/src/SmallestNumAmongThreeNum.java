import java.util.Scanner;

public class SmallestNumAmongThreeNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the first number:");
        double num1= in.nextDouble();

        System.out.println("enter the second number:");
        double num2= in.nextDouble();

        System.out.println("enter the third number:");
        double num3= in.nextDouble();

        System.out.println("the  smallest num is: " + smallestNum(num1, num2, num3));
    }
    public static double smallestNum(double num1, double num2, double num3){
        return Math.min(Math.min(num1 , num2 ), num3);
    }
}


