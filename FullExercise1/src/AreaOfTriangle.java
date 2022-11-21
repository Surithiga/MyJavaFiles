import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of width is:");
        double w=sc.nextDouble();

        System.out.println("The value of height is:");
        double h=sc.nextDouble();

        double area=(w*h)/2;
        System.out.println("The value of area is:"+area);

    }
}



