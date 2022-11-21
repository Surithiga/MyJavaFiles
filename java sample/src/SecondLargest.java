import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] number={100,98,87,76,45,32};
        Arrays.sort(number);
       // System.out.println(Arrays.toString(number));
        System.out.println(number[number.length-2]);
    }
}
