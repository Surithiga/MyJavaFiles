import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementsInAnArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();
        listStrings.add("z");
        listStrings.add("y");
        listStrings.add("x");
        listStrings.add("w");

        System.out.println("array before swap: " + listStrings);

        Collections.swap(listStrings,0,3);

        System.out.println("Array after swap: " + listStrings);
    }
}
