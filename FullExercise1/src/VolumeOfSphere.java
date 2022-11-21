import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of sphere:");
        double r=sc.nextDouble();

        double volume=(4*22*r*r*r)/(3*7);
        System.out.println("volume is:"+volume);

    }
}
