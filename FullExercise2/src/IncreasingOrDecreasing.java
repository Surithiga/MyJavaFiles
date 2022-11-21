import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1=sc.nextDouble();

        System.out.println("enter the second number:");
        double num2=sc.nextDouble();

        System.out.println("enter the third number");
        double num3=sc.nextDouble();

        if(num1<num2 && num2<num3){
            System.out.println("numbers are in increasing order");
        }
        else if(num1<num2 && num2<num3){
            System.out.println("numbers are in decreasing order");
        }
        else{
            System.out.println("neither increasing or decreasing order");
        }
    }
}
