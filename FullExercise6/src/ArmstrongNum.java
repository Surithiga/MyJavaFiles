public class ArmstrongNum {
    public static void main(String[] args) {
        int digits1, digits2, digits3;
        for(int num=1; num<=600; num++){
            int temp= num;
            digits1 = temp%10;

            temp= temp/10;
            digits2=temp%10;

            temp=temp/10;
            digits3=temp%10;
            if(digits1 * digits1 * digits1 + digits2 * digits2 * digits2 + digits3 * digits3 * digits3==num){
                System.out.println(num);
            }
        }
    }
}
