public class PositiveInteger {
    public static void main(String[] args) {
        int number=679;
        int sum=0;
        while(number>0) {
            int temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
            System.out.println("sum of digits:"+sum);

    }
}
