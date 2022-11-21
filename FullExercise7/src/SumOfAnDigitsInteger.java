import java.util.Scanner;

public class SumOfAnDigitsInteger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digits=0;
        System.out.println("enter the number");
        digits= in.nextInt();
        System.out.println("the sum of digits: " + sumDigits(digits));
    }
    public static int sumDigits(long num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

}
