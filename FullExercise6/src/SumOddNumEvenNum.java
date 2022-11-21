import java.util.Scanner;

public class SumOddNumEvenNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
        int evensum=0;
        int oddsum=0;
        System.out.println("enter any number: ");
        number=in.nextInt();
        for(int n=1; n<= number; n++){
            if(n % 2==0){
                evensum = evensum+n;
            }
            else{
                oddsum =oddsum+n;
            }
            System.out.println("add the even number" + number + "=" + evensum);
            System.out.println("add the odd number" + number + "=" + oddsum);
        }
    }
}
