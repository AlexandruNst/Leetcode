package Array.Medium._8_1409_Queries_on_a_Permutation_With_Key;

import java.util.ArrayList;
import java.util.List;

//T: O(n) (?) depends on list implementation
//S: O(n)
class Solution {
    public int[] processQueries(int[] queries, int m) {

        int[] result = new int[queries.length];
        int index = 0;
        List<Integer> copy = new ArrayList<>();
        for(int i = 0; i < m; i++){
            copy.add(i+1);
        }

        for(int query : queries){
            int indexToRemove = copy.indexOf(query);
            result[index++] = indexToRemove;
            copy.remove(indexToRemove);
            copy.add(0, query);
        }

        return result;
    }
}
