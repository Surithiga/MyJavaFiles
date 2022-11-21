import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the first number");
        int num1=obj.nextInt();
        System.out.println("enter the second number");
        int num2= obj.nextInt();
        System.out.println("enter the third number");
        int num3= obj.nextInt();
        System.out.println("enter the fourth number");
        int num4= obj.nextInt();
        System.out.println("enter the fifth number");
        int num5= obj.nextInt();

        System.out.println("enter the average value:"+(num1+num2+num3+num4+num5)/5);

    }
}

