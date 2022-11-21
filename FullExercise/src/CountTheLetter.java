import java.util.Arrays;
public class CountTheLetter {
    public static void main(String[] args) {
        String test="My age is 20 !!";
        count(test);
    }
    public static void count(String x){
        char[]ch=x.toCharArray();
        int letter=0;
        int spaces=0;
        int numbers=0;
        int other=0;
        for(int i=0;i<x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            else if(Character.isDigit(ch[i])){
                numbers++;
            }else{
                other++;
            }
        }
        System.out.println("The String is: My age is 20 !!");
        System.out.println("letter:"+letter);
        System.out.println("Spaces:"+spaces);
        System.out.println("numbers:"+numbers);
        System.out.println("others:"+other);
    }
}

