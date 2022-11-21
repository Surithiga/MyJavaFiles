public class Return {

    static String myMethod(String x, String y, int z){
        return x+" "+y+" "+z;
    }

    public static void main(String[] args) {
        String v=myMethod("Surithi","Udhaya", 20);
        System.out.println("add the x y z"+" "+v);
    }
}
