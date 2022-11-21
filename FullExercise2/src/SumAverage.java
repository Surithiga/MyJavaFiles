import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int i = 0,numbers=0,sum=0;
        int sum =0,num1,num2,num3,num4,num5;
        double avg;
        System.out.println("enter the 1st number ");
         num1=sc.nextInt();

        System.out.println("enter the 2nd number");
         num2=sc.nextInt();

        System.out.println("enter the 3rd number");
        num3=sc.nextInt();

        System.out.println("enter the 4th number");
        num4=sc.nextInt();

        System.out.println("enter the 5th number");
        num5=sc.nextInt();
//
//        for( i=0; i<=5; i++){
//            sum+=number;
//        }
        sum=num1+num2+num3+num4+num5;
        avg=sum/5;
        System.out.println("the sum of numbers are: "+sum);
        System.out.println("the average is: "+avg);

    }
}
