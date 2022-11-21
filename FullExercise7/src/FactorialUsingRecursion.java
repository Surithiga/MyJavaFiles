public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num=7;
        long factorial = multiplyNumbers(num);
        System.out.println("factorial of " + num + "=" + factorial);
    }
    public static long multiplyNumbers(int num){
        if(num >=1)
            return num * multiplyNumbers(num-1);
        else
            return 1;
    }
}
