public class ReverseAnInteger {
    public static void main(String[] args) {
        int number =958567, reverse=0;

        while(number!=0){
            int reminder=number % 10 ;
            reverse = reverse * 10 + reminder;
            number = number /10;
        }
        System.out.println("reverse an integer is : " + reverse);
    }
}
