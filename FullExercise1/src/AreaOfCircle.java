import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        float r,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius value of");
        r=sc.nextInt();
        area=(float)(22.0/7)*r*r;
        System.out.printf("enter the value of radius and circle %.4f",r,area);

    }
}
