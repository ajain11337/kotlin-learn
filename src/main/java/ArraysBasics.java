import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysBasics {

    /**
     * Problem : Two Sum ->
     * Try 1 : Indexes got messed up.
     * Try 2 : Hashmap.
     *
     */

    // Main driver method
    public static void main(String[] args) {
        // Custom input array
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);

        // Printing the array after sorting
        System.out.println(Arrays.toString(arr));

        // Size
        System.out.println(arr.length);

    }

    private int[] returnType(){
        return new int[]{0, 1};
    }
}
