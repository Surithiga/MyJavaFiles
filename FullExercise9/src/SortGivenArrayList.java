import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortGivenArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<>();

        listStrings.add("Vivien");
        listStrings.add("SaiSethu");
        listStrings.add("Pugazh");
        System.out.println("list before sort: " + listStrings);

        Collections.sort(listStrings);
        System.out.println("list after sort: " + listStrings);
    }
}
