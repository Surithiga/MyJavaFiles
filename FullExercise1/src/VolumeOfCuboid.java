import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        double l=sc.nextDouble();

        System.out.println("enter the breadth:");
        double b=sc.nextDouble();

        System.out.println("enter the height:");
        double h=sc.nextDouble();

        double volume=(l*b*h);
        System.out.println("volume of cylinder is:"+volume);
    }
}
