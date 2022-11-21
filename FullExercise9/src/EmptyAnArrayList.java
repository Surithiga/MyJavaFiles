import java.util.ArrayList;
import java.util.List;

public class EmptyAnArrayList {
    public static void main(String[] args) {
        List<String> listStrings=new ArrayList<String>();
        listStrings.add("a");
        listStrings.add("b");
        listStrings.add("c");
        listStrings.add("d");

        listStrings.removeAll(listStrings);

        System.out.println(listStrings);
    }
}
