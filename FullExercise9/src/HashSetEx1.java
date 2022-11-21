import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();

        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Mango");
        hs.add("Banana");

       // Iterator<String> itr = hs.iterator();
        //while (itr.hasNext()) {
          //  System.out.println(itr.next());
  //      }

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.clone());
        System.out.println(hs.containsAll(hs));
    }
}