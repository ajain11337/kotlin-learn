import kotlin.Pair;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        String s = "geeksforgeek";
        System.out.println(textJustificationExample());
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

    // Leetcode : Hard
    public static List<String> textJustificationExample(){
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        Integer maxWidth = 16;

        Integer currentIndex = 0;

        while (currentIndex < words.length){
            Pair result = getIndexAndSpacing(words, maxWidth, currentIndex);
            Integer returnIndex = (Integer) result.getFirst();
            Integer spacingRequired = (Integer) result.getSecond();
        }
        return new ArrayList<>();
    }

    private static Pair<Integer, Integer> getIndexAndSpacing(String[] words, Integer maxWidth, Integer currentIndex) {
        int count = 0;
        int currentWidth = 0;
        int returnIndex = currentIndex;
        for(int i = currentIndex; i < words.length; i++){
            if(currentWidth < maxWidth){
                currentWidth = currentWidth + words[i].length();
                returnIndex = i;
                count++;
            }else {
                return new Pair<>(returnIndex, maxWidth - currentWidth);
            }
        }
        return new Pair<>(returnIndex, maxWidth - currentWidth);
    }
}
