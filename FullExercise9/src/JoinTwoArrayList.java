import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        List<String>listStrings= new ArrayList<String>();
        listStrings.add("Vini");
        listStrings.add("dharshu");
        listStrings.add("Surithi");
        listStrings.add("Ahal");
        System.out.println("Arraylist: " + listStrings);

        List<String>listStrings1= new ArrayList<String>();
        listStrings1.add("udhaya");
        listStrings1.add("selvi");
        System.out.println("Arraylist1: " + listStrings1);

        List<String> s= new ArrayList<String>();
        s.addAll(listStrings);
        s.addAll(listStrings1);
        System.out.println(" join the Arraylist: " + s);
    }
}
