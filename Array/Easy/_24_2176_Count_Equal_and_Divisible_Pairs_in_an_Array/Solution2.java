package Array.Easy._24_2176_Count_Equal_and_Divisible_Pairs_in_an_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//T: O(n^2) - worst case
//S: O(n)
class Solution2 {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                List<Integer> indices = map.get(num);
                for(int ind : indices){
                    if((ind * i) % k ==0) count++;
                }
                indices.add(i);
                map.put(num, indices);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                map.put(num, indices);
            }
        }

        return count;
    }
}
