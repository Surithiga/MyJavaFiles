import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the a value");
        int a= in.nextInt();
        System.out.println("enter the b value");
        int b= in.nextInt();


        int c=a+b;
        System.out.println("addition:"+c);

        int d=a-b;
        System.out.println("subtraction:"+d);

        int e=a*b;
        System.out.println("Multiplication:"+e);

        int f=a/b;
        System.out.println("division:"+f);

        float g=a/b;
        System.out.println("Quo:"+g);

        int h=a%b;
        System.out.println("Rem:"+h);

        int i=a%b;
        System.out.println("modulus:"+i);
    }
}
