public class Exercise8 {
    public static void main(String[] args) {
        int number;
        for (int i = 0; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 500; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 500; i++) {
            if (i % 8 == 0) {
                System.out.println(i);
            }
        }
    }
}