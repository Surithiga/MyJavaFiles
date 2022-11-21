public class ReverseString {
    public static void main(String[] args) {
        String name= "Jayakumari";
        StringBuilder reverseString=new StringBuilder(name);
        reverseString.reverse();
        String result=reverseString.toString();
        System.out.println("Reverse string:" + result);
    }
}
