public class HCF {
    public static void main(String[] args) {
        int a = 18, b = 54, hcf = 0;

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;

                System.out.println("hcf of two numbers is: " + hcf);
            }
        }
    }
}