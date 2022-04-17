import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphsBasics {

    public static void main(String[] args) {

    }


    /**
     *  https://leetcode.com/problems/reconstruct-itinerary/discuss/1490090/Java-oror-Easy-Approach-with-Explanation-oror-DFS-oror-Euler-oror-Topological-Sort
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        HashMap<String, Boolean> visitedEdges = new HashMap<>();

        // Preparation of hash map.
        for(List<String> ticket : tickets){
            String key = ticket.get(0);
            String value = ticket.get(1);
            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(value);
            visitedEdges.put(key + value, false);
        }

        String fromPoint = "JFK";
        List<String> sol = new ArrayList<>();

        while(true){
            String toPoint = getLexSmallestString(hashMap.get(fromPoint));
            if(visitedEdges.get(fromPoint + toPoint)){
                // means loop complete
                break;
            }else{
                sol.add(fromPoint);
                sol.add(toPoint);
                fromPoint = toPoint;
            }
        }

        return sol;
    }

    private String getLexSmallestString(List<String> list){

    }
}
