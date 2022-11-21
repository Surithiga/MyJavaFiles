import java.util.ArrayList;
import java.util.List;

public class Teacher1 {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Selvi","BE","Tmk",1,40);
        Teacher teacher2=new Teacher("Udhaya","M.sc","ond",3,23);
        Teacher teacher3=new Teacher("Ahalya","B.sc","tkr",5,35 );
        Teacher teacher4=new Teacher("Surithi","B.sc","tkr",7,18);
        Teacher teacher5=new Teacher("Vinitha","BCA","ond",7,21);
        Teacher teacher6=new Teacher("Dharshini","BA","tnj",7,20);
        Teacher teacher7=new Teacher("Vaishali","M.sc","tnd",7,25);
        Teacher teacher8=new Teacher("Jothika","BE","tnj",7,20);
        Teacher teacher9=new Teacher("Priya","BCA","ond",7,30);
        Teacher teacher10=new Teacher("Dharani","ME","tnj",7,37);

        ArrayList<Teacher>list=new ArrayList<>();

        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);
        list.add(teacher5);
        list.add(teacher6);
        list.add(teacher7);
        list.add(teacher8);
        list.add(teacher9);
        list.add(teacher10);
       // System.out.println(list);

        System.out.println(method1(list,"tkr"));
        System.out.println(method2(list,"tkr",5));
        System.out.println(method3(list,"tnj"));
        System.out.println(method4(list,"B.sc"));
        System.out.println(method5(list,23));
    }

    public static int method1(List<Teacher> teacherList, String location){
        int count=0;
        for(Teacher teach:teacherList){
            if(teach.getLocation()==location){
                count++;
            }
        }
        return count;
    }
    public static int method2(List<Teacher> teacherList,String location,int standard){
        int count=0;
        for(Teacher teach:teacherList){
            if(teach.getLocation()==location && teach.getStandard()==standard){
                count++;
            }
        }
        return  count;
    }
    public static int method3(List<Teacher>teacherList,String location){
        int count=0;
        int sum=0;
        for(Teacher teach:teacherList){
            if( teach.getLocation()==location ){
                count++;
                sum +=teach.getAge();
            }
        }
        return sum;
    }
    public static int method4(List<Teacher>teacherList,String degree){
        int count=0;
        for(Teacher teach:teacherList){
            if(teach.getDegree()==degree){
                   if(teach.getAge()>20 && teach.getAge()<40){
                count++;
                }
            }
        }
        return count;
    }
    public static int method5(List<Teacher>teacherList,int age){
            int count = 0;
            for (Teacher teach : teacherList) {
                if (teach.getAge() > age) {
                    count++;
                }
            }

        return count;
    }
}
