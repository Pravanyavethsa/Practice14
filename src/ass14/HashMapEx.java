package ass14;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hash=new HashMap<>();
        hash.put(10,"pravanya");
        hash.put(20,"sirisha");
        hash.put(23,"vanitha");
        hash.put(24,"satya");
        hash.put(44,"pavan");
        hash.put(39,"jaya");
        hash.remove(23,"vanitha");
        System.out.println("size is:"+hash.size());
        for(Map.Entry Values: hash.entrySet()){
            System.out.println(Values.getKey()+" "+Values.getValue());
        }
        hash.put(14,"jaya");
        for(int Item: hash.keySet()){
            String s= hash.get(Item);
            System.out.println(s);
            boolean isPresent=hash.containsKey(24);
            System.out.println(isPresent);
            boolean wasPresent=hash.containsValue("pravanya");
            System.out.println(wasPresent);

        }
    }

}
