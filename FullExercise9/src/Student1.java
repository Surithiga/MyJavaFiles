import java.util.ArrayList;
import java.util.List;

public class Student1 {
    public static void main(String[] args) {
        List<Student> listStrings=new ArrayList<Student>();
        Student obj=new Student();
        obj.setName("Surithi");
        obj.setCity("Orathanadu");
        obj.setPhNo("9585679857");

        listStrings.add(obj);

        for(Student obj1:listStrings){
            System.out.println("after removing the arraylist: " + obj1.getName());
            System.out.println("after removing the arraylist: " + obj1.getCity());
            System.out.println("after removing the arraylist: " + obj1.getPhNo());
        }
    }
}
