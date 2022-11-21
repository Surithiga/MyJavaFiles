package packages2;

public class FruitsEx1 {
    public static void main(String[] args) {
        Fruits fruits1=new Fruits("Apple","Red",2,300);
        System.out.println(fruits1.getName());
        System.out.println(fruits1.getColour());
        System.out.println(fruits1.getKilo());
        System.out.println(fruits1.getPrice());

        fruits1.setName("Orange");
        System.out.println(fruits1.getName());

        fruits1.setColour("Orange");
        System.out.println(fruits1.getColour());

        fruits1.setKilo(2);
        System.out.println(fruits1.getKilo());

        fruits1.setPrice(200);
        System.out.println(fruits1.getPrice());
    }
}
