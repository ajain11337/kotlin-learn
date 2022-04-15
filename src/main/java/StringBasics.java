import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        String s = "geeksforgeek";
        System.out.println(groupAnagramsExample());
    }

    public static String sortString(String inputString) {
        // Converting input string to character array
        char[] tempArray = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    // Group Anagrams.
    public static List<List<String>> groupAnagramsExample(){
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        Map<String, ArrayList<String>> hashMap = new HashMap<>();
        for(String str : input) {
            String sortedStr = sortString(str);

            if (!hashMap.containsKey(sortedStr)) {
                hashMap.put(sortedStr, new ArrayList<>());
            }

            hashMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(hashMap.values());
    }
}
