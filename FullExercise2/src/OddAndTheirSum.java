import java.util.Scanner;

public class OddAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0;
        System.out.println("enter the number of terms:");
        n = sc.nextInt();
        System.out.println("the odd numbers are:");
        for (i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;

            System.out.println("the sum of odd natural number  is:" + sum);
        }
    }
}