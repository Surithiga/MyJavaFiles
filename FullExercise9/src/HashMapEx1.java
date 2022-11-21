import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap hashmap=new HashMap();
       hashmap.put("poori",30);
       hashmap.put("pongal",35);
       hashmap.put("dosa",20);
       System.out.println(hashmap);

       System.out.println(hashmap.get("poori"));
        System.out.println(hashmap.containsKey("idly"));
        hashmap.remove("pongal");
        System.out.println(hashmap.get("pongal"));
        System.out.println(hashmap.remove("dosa"));

        System.out.println(hashmap.size());
       System.out.println(hashmap.isEmpty());

       hashmap.clear();
        System.out.println(hashmap.isEmpty());
    }

}
