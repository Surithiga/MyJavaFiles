public class TransposeMatrix {
    public static void main(String[] args) {
        int original[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("print the matrix without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("print the matrix after transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[j][i] + " ");
            }
            System.out.println();
        }
    }
}