import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i == 1){
            System.out.println("enter the character" + ch + "is vowel");
    }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        System.out.println("enter the character" + ch + "is consonant");
    }
        else{
            System.out.println("not an alphabet");
        }
}
}