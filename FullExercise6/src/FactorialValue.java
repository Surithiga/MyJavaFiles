public class FactorialValue {
    public static void main(String[] args) {
        int number = 7;
        int fact = 1;
        for (int i = 1; i <= 7; i++) {
            fact = fact * i;

            System.out.println( fact);
        }
    }
}