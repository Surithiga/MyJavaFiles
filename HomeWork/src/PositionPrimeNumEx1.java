public class PositionPrimeNumEx1 {
    public static void main(String[] args) {
        int num = 1, count = 0;
        int n = 9;
        int i;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
                if (i == num) {
                    count = count + 1;
                }
            }
        System.out.println(num);
        }
    }
