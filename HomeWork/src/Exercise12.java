import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n1,n2;
        char operator;
        System.out.println("enter the first number: ");
        n1=in.nextInt();
        System.out.println("enter the second number: ");
        n2=in.nextInt();

        System.out.println("enter operator from '+','-','*','/','%': ");
        operator=in.next().charAt(0);

        if (operator == '+') {
            System.out.println("addition is: " + add(n1, n2));
        }
        else if(operator=='-'){
            System.out.println("subtraction is: " + sub(n1,n2));
        }
        else if(operator=='*'){
            System.out.println("multiplication is: " + mul(n1,n2));
        }
        else if(operator=='/'){
            System.out.println("division is: " + div(n1,n2));
        }
        else if(operator=='%'){
            System.out.println("modulus is: " + modulus(n1,n2));
        }
        else{
            System.out.println("invalid operators");
        }
    }
    static int add(int a, int b){
        int c=a+b;
        return c;
    }
    static int sub(int a, int b) {
        int c = a - b;
        return c;
    }
    static int mul(int a, int b) {
        int c = a * b;
        return c;
    }
    static int div(int a, int b) {
        int c = a / b;
        return c;
    }
    static int modulus(int a, int b) {
        int c = a % b;
        return c;
    }
}
