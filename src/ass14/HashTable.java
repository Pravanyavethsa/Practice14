package ass14;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String>hash=new Hashtable<>();
        hash.put(10,"pravanya");
        hash.put(20,"sirisha");
        hash.put(23,"vanitha");
        hash.put(24,"satya");
        hash.put(44,"pavan");
        hash.put(39,"jaya");
        hash.remove(20,"sirisha");
        System.out.println("size is "+hash.size());
        boolean isPresent=hash.contains("pavan");
        System.out.println(isPresent);
        hash.clear();
        System.out.println("after removing the values are:");
        for(Map.Entry Values: hash.entrySet()){
            System.out.println(Values.getKey()+" "+Values.getValue());

        }
    }
}
