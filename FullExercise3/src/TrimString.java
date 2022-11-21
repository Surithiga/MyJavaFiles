public class TrimString {
    public static void main(String[] args) {
        String name="Udhaya Dharani";
         String Name1=name.replaceAll("\\s+","");
       // String new_name=name.trim();

        System.out.println("original name: "+name);
        System.out.println("replace name: "+Name1);
      //  System.out.println("new name: "+new_name);
    }
}
