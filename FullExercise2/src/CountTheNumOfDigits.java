import java.util.Scanner;

public class CountTheNumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");

        if(sc.hasNextLong()){
            long num=sc.nextLong();

            if(num<0){
                num*=-1;
            }
            int digits=1;
            if(num>=10 && num<100){
                digits=2;
            }
            else if(num>=100 && num<1000 ){
                digits=3;
            }
            else if(num>=1000 && num<10000){
                digits=4;
            }
            else if(num>=10000 && num<100000){
                digits=5;
            }
            else if(num>=100000 && num<1000000){
                digits=6;
            }
            else if(num>=1000000 && num<10000000L){
                digits=7;
            }
            System.out.println("number of digit in the number:"+digits);
        }
        else{
            System.out.println("the number is not an integer");
        }
    }
}
