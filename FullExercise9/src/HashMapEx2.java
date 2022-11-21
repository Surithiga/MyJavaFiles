import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("rose", 20);
        hm.put("Jasmine", 50);
        hm.put("lotus", 20);
        hm.put("lilly", 8);

        Set s = hm.entrySet();
        System.out.println(s);

        Iterator r = s.iterator();
        while (r.hasNext()) {
          //   System.out.println(r.next());
            // }
            //  Collection o = hm.values();
            //System.out.println(o);

            //   Collection p = hm.keySet();
            // System.out.println(p);

           Object x = r.next();
            Map.Entry e = (Map.Entry) x;
            // System.out.println(e.getValue());
            //System.out.println(e.getKey());

            Object price = e.getValue();
            Object Names = e.getKey();
            if (price.equals(20))
                    System.out.println(Names);
                }
            }
        }
