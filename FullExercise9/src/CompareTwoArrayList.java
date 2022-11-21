import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CompareTwoArrayList extends ArrayList{
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();

        listStrings.add("FZ");
        listStrings.add("Royal Enfield");
        listStrings.add("Pulser");
        listStrings.add("Rx 100");
        listStrings.add("R15");

        List<String>listStrings1=new ArrayList<String>();
        listStrings1.add("Royal Enfield");
        listStrings1.add("FZ");
        listStrings1.add("R15");
//        listStrings1.rem

        CompareTwoArrayList listStrings2=new CompareTwoArrayList();
        listStrings2.add(22);
        listStrings2.add(33);
        listStrings2.add(44);
        listStrings2.add(55);
        listStrings2.add(66);
//        for(String a:listStrings)
//        listStrings2.add(listStrings1.contains(a)? "Yes": "No");
        System.out.println(listStrings2);
          listStrings2.removeRange(1,4);
        System.out.println(listStrings2);

    }
}
