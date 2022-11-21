import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("The value of length is:");
        double l=sc.nextDouble();

        System.out.println("The value of breath is:");
        double b=sc.nextDouble();

       // area=(length*breath)/2;
        double area=(l*b)/2;
        System.out.println("The value of area is:"+area);

    }
}

