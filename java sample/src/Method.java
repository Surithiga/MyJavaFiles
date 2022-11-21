public class Method {

    static String myMethod(String a,String b,int c){
        return a+" "+b+" "+c;
    }
    public static void studentDetails(String name, String subject, double mark){
        System.out.println("Student name:::"+name+"subject:::"+subject+"mark:::"+mark);
    }

    public static void main(String[] args) {
        String e=myMethod("Surithi","Physics",90);
        System.out.println(e);
    }

}
