import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(2, 4);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        // Contains
        Boolean hasKey = hashMap.containsKey(2);
        Boolean hasValue = hashMap.containsValue(2);
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        hashMap.get(2);

        // Iterating over entry sets
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

        }
    }
}
