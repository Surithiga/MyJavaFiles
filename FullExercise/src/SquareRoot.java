import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("value of square root is:");
        int num=sc.nextInt();
        double squareRoot=Math.pow(num, 0.5);
        System.out.println("the square root of given number:"+num+"="+squareRoot);
    }
}
