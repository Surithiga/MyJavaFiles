import java.util.Scanner;

public class SurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        double l=sc.nextDouble();

        System.out.println("enter the breadth:");
        double b=sc.nextDouble();

        System.out.println("enter the height:");
        double h=sc.nextDouble();

        double area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println("total surface area of cuboid is:"+area);
    }
}
