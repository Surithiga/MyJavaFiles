import java.util.Scanner;

public class PositionPrimeNum {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int Position;
       int PrimeNumber;
       int array[]={1,2,3,5,7,11,15,17,19};

       System.out.println("enter the position");
       int position=sc.nextInt();
       System.out.println("enter the primeNumber");
       int primeNumber=sc.nextInt();

         for (int i = 0; i < array.length; i++)
             if(primeNumber==array[i]){
                 if(position==i){
                     System.out.println("Yes");
                 }
                 else{
                     System.out.println("No");
                 }

         }
     }


}
