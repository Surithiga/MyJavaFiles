import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();

        System.out.println("enter the second number;");
        int num2=sc.nextInt();

        System.out.println("enter the third number");
        int num3=sc.nextInt();

        if(num1==num2 && num1==num3){
            System.out.println("all numbers are equal");
        }
        else if((num1==num2) || (num1==num3) || (num3==num2)){
            System.out.println("neither all are equal or different");
        }
        else{
            System.out.println("all numbers are different");
        }
    }
}
