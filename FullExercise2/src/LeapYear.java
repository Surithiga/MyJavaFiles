import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Input the year");
        int year=sc.nextInt();

        boolean a=(year%4)==0;
        boolean b=(year%100)!=0;
        boolean c=((year%100==0)&&(year%400==0));

        if(a&&(b||c)){
            System.out.println("It is leap year"+year);
        }
        else{
            System.out.println("It is a not leap year"+year);
        }
    }
}
