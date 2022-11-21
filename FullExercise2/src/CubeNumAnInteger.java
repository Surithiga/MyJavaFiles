import java.util.Scanner;

public class CubeNumAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("enter the number of terms are:");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("cube of" + i + "is" + (i * i * i));
        }
    }
}