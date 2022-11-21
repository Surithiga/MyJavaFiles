import java.util.Scanner;

public class CalculateTheSumOfSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        double sum=0;
        System.out.println("enter number of terms of series: ");
        num=in.nextInt();

        for(int i=1; i<=num; i++){
            sum +=1.0 /i;
        }
        System.out.println("sum: " + sum);
    }
}
