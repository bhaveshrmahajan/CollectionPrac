import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //for adding element in map
        map.put(1,"Bhavesh");
        map.put(2,"Ashish");
        map.put(3,"Amol");
        System.out.println(map);

        String student =map.get(2);
        System.out.println(student);

        //for checking key is present in map
        System.out.println(map.containsKey(3));
        //for checking value is present in map
        System.out.println(map.containsValue("Bhavesh"));

        for(int i : map.keySet())
            System.out.println(map.get(i));

        Set<Map.Entry<Integer,String>> entries =map.entrySet();
        for(Map.Entry<Integer,String> entry : entries)
            entry.setValue(entry.getValue().toUpperCase());
        System.out.println(map);
    }

}
