import java.util.Scanner;

public class FloatValueToAbsoluteValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input a float number: ");
        float s=in.nextFloat();

        System.out.printf("the absolute value of %.2f is : %.2f ", s , convert(s));
//        System.out.println("/n");
    }
    public static float convert(float n){
        float absoluteValue= (n >= 0) ? n: -n;
        return absoluteValue;
    }
}
