import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElementsInArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();

        listStrings.add("A");
        listStrings.add("B");
        listStrings.add("C");
        listStrings.add("D");

        System.out.println("list before shuffle: " + listStrings);

        Collections.shuffle(listStrings);

        System.out.println("list after shuffle: " + listStrings);
    }
}
