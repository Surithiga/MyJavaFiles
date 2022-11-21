import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;

        System.out.println("enter the a value");
        a=in.nextInt();

        System.out.println("enter the b value");
        b=in.nextInt();

        System.out.println("enter the c  value");
        c=in.nextInt();

        if(a<b){
            System.out.println("a is less than of b");
        }
        else if(b>c){
            System.out.println("b is greater than of c");
        }
        else if(c>a){
            System.out.println("c is greater than a");
        }
        else{
            System.out.println("invalid");
        }
    }
}
