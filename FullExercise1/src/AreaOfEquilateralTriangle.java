import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of equilateral triangle:");
        double s=sc.nextDouble();

        double area=(Math.sqrt(3)/4)*(s*s);
        System.out.println("The value of area is:"+area);

    }
}



