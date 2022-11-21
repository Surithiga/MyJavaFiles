import java.util.Scanner;
public class TotalMarksAndPercentage {
    public static void main(String[] args) {
        int n,total=0, percentage=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        n= in.nextInt();
        int[] marks=new int[n];
        System.out.println("enter the marks of 100:");

        for(int i=0; i<n; i++){
            marks[i]=in.nextInt();
            total=total + marks[i];
        }
        percentage=total/n;
        System.out.println("sum of total marks: " + total);
        System.out.println("total marks of percentage: " + percentage);
    }
}
