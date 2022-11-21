public class IndexWithinTheString {
    public static void main(String[] args) {
        String name="Bharathi Dhasan";
        System.out.println("original String is:"+name);

        int index1=name.charAt(0);
        int index2=name.charAt(14);

        System.out.println("the character at position 0 is: "+(char)index1);
        System.out.println("the character at position 15 is: "+(char)index2);
    }
}
