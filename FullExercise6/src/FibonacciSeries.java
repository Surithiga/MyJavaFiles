public class FibonacciSeries {
    public static void main(String[] args) {
        int count=7, num1=0, num2=1;
        System.out.println("fibonacci series of " + count + " numbers");

        int i=1;
        while(i<=count){
            System.out.println(num1 + " ");
            int SumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = SumOfPrevTwo;
            i++;
        }
    }
}
