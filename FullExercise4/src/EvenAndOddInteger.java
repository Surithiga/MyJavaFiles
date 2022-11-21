import java.util.Arrays;
public class EvenAndOddInteger {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        System.out.println("original array:"+Arrays.toString(num));
        int value=0;
        for(int i=0; i<num.length; i++){
            if(num[i] % 2==0)
                value++;
        }
        System.out.println("number of even number is: " + value);
        System.out.println("number of odd number is: " + (num.length-value));
    }
}
