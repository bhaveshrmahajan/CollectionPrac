import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> demo = new LinkedHashMap<>();
        demo.put("Orange",10);
        demo.put("Apple",20);
        demo.put("Mango",30);

        for(Map.Entry<String,Integer> entry : demo.entrySet()){
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }
    }
}
