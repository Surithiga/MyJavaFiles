import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("Thanjavur",49);
        hm.put("Orathanadu",49);
        hm.put("Trichy",81);
        hm.put("Kumbakonam",81);

        System.out.println(hm.get("Orathanadu"));
        hm.remove("Trichy");
        System.out.println(hm.get("Trichy"));
    }
}
