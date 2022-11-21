public class ConcatenateTwoString {
    public static void main(String[] args) {
        String name="Surithi";
        String name1="Rajangam";

        System.out.println("String1:"+name);
        System.out.println("String2:"+name1);

        String name2=name.concat(name1);
        System.out.println("The concatenated String:"+name2);
    }
}
