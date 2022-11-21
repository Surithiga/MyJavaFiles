public class SumValuesOfAnArray {
    public static void main(String[] args) {
     int myNum[]={10,20,30,40,50};
     int sum=0;

     for(int i: myNum){
         sum+=i;
         System.out.println("the sum is: "+ sum);
     }

    }
}
