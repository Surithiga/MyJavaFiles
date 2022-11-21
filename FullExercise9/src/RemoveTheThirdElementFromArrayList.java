import java.util.ArrayList;
import java.util.List;

public class RemoveTheThirdElementFromArrayList {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();
        listStrings.add("Sai");
        listStrings.add("Varun");
        listStrings.add("Iniyavan");
        listStrings.add("Edhalya");
        System.out.println(listStrings);

        listStrings.remove(3);
        System.out.println(listStrings);

    }
}
