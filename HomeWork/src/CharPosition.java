import java.util.Scanner;

public class CharPosition {
    public static void main(String[] args) {
        String words = "Jack and jill hent up the hill came back in the evening";
        Scanner sc = new Scanner(System.in);
        System.out.println("the character is");
        char[] name = words.toCharArray();
        char character = sc.next().charAt(0);

        for (int i = 0; i < name.length; i++) {
            if (name[i] == character)
                System.out.println(i);
        }
    }
}