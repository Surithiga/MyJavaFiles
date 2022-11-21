import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        double r=sc.nextDouble();

        System.out.println("enter the height:");
        double h=sc.nextDouble();

        double volume=(22*r*r*h)/(3*7);
        System.out.println("volume of cone is:"+volume);
    }
}
