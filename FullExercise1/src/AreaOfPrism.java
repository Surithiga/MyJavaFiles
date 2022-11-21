import java.util.Scanner;
public class AreaOfPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("The value of base is:");
            double b=sc.nextDouble();

            System.out.println("The value of height is:");
            double h=sc.nextDouble();

            double area=(b*h)/2;
            System.out.println("The value of prism is:"+area);

        }
    }

