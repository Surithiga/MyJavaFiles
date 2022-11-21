import java.util.ArrayList;
import java.util.List;

public class ArrayListAtTheFirstPosition {
    public static void main(String[] args) {
        List<String>listStrings=new ArrayList<String>();
        listStrings.add("Rajameena");
        listStrings.add("Ragavi");
        listStrings.add("Bothini");
        listStrings.add("Surithi");
        System.out.println(listStrings);

        listStrings.add(0,"Rajangam");
        listStrings.add(1,"jayakumari");
        System.out.println(listStrings);
        }
    }

