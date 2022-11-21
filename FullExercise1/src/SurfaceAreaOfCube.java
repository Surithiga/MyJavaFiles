import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of cube:");
        double side=sc.nextDouble();

        double r=4*side*side;
        System.out.println("curved surface area of cube is:"+r);
    }
}
