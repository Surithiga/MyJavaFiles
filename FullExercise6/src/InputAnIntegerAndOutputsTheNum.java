public class InputAnIntegerAndOutputsTheNum {
    public static void main(String[] args) {
        int reverse=0;
        int number=958567;

        while (number!=0){
            int remainder=number%10;
            reverse=reverse * 10 + remainder;
            number= number/10;
        }
        System.out.println(reverse);
    }
}
