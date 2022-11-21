public class SecondLowestNum {
    public static int getSecondLowest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i; j < total; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 6, 2};
        int b[] = {90, 98, 78, 67, 76};
        System.out.println("SecondLowest:" + getSecondLowest(a, 6));
        System.out.println("SecondLowest:" + getSecondLowest(b, 5));
    }
}

