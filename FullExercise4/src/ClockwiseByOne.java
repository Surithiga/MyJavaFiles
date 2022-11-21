import java.util.Arrays;

public class ClockwiseByOne {
    static int array[] = new int[]{1, 2, 3, 4, 5, 6, 7};

    static void rotate_array() {
        int a = array[array.length - 1], i;
        for (i = array.length - 1; i > 0; i--)
            array[i] = array[i - 1];
        array[0] = a;
    }

    public static void main(String[] args) {
        rotate_array();

        System.out.println("original array: ");
        System.out.println(Arrays.toString(array));


    }
}




