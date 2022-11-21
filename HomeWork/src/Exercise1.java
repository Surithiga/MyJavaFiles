import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value1,value2;
        System.out.println("enter the value 1:");
        value1=input.nextInt();

        System.out.println("enter the value 2:");
        value2=input.nextInt();

        if(value1>value2){
            System.out.println("i am a boy");
        }
        else if(value2>value1){
            System.out.println("i am a girl");
        }
        else{
            System.out.println("invalid");
        }
    }
}
