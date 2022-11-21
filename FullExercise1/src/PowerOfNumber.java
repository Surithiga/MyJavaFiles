public class PowerOfNumber {
    public static void main(String[] args) {
        int base=9, exponent=4;
        long result=1;
        while(exponent !=0){
            result *= base;
            --exponent;
        }
        System.out.println("power of number="+result);
    }
}
