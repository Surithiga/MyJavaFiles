import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        double r=sc.nextDouble();

        System.out.println("enter the height:");
        double h=sc.nextDouble();

        double area=((2*22*r)/7)*(r+h);
        System.out.println("total surface area of cylinder is:"+area);
    }
}
