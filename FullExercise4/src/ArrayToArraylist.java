import java.util.Arrays;
import java.util.ArrayList;
public class ArrayToArraylist {
    public static void main(String[] args) {
        String array[]={"Sai", "Varun", "Iniyavan", "Edhalya","Sudhiks"};
        ArrayList <String> List = new ArrayList<String>(Arrays.asList(array));
        System.out.println(List);
    }
}
