import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j,num;
        System.out.println("enter number of terms:");
        num=sc.nextInt();
        for(j=0; j<=num; j++){
            System.out.println(num + "X" +j+ "=" + num*j);
        }
    }
}
