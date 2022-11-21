import java.util.ArrayList;
import java.util.List;

public class IncreaseTheSizeOfAnArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();
        listStrings.add("a");
        listStrings.add("b");
        listStrings.add("c");
        System.out.println("original array list: " + listStrings);

        //   ((ArrayList<String>)listStrings).ensureCapacity(4);

        listStrings.add("d");
        listStrings.add("e");
        System.out.println("new increased array list: " + listStrings);
    }
}
