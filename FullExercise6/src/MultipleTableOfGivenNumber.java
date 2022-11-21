import java.util.Scanner;

public class MultipleTableOfGivenNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=in.nextInt();
        System.out.println("multiplication table of: " + num);

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
