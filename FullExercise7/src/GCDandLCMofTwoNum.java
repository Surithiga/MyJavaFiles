import java.util.Scanner;

public class GCDandLCMofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the two numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("the GCD of two numbers is: " + GCD(num1, num2));
        System.out.println("the LCM of two numbers is: " + LCM(num1, num2));
    }

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
         else
            return GCD(b, a % b);
        }
        public static int LCM(int a, int b){
            return a * b /(GCD(a,b));
        }
    }

