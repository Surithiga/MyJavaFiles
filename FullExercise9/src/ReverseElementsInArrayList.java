import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementsInArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();
        listStrings.add("a");
        listStrings.add("b");
        listStrings.add("c");
        listStrings.add("d");

        Collections.reverse(listStrings);

        System.out.println(listStrings);
    }
}
