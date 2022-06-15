package Array.Medium._4_1282_Group_the_People_Given_the_Group_Size_They_Belong_To;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//T: O(n)
//S: O(n)
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>(groupSizes[i]));
            }
            map.get(groupSizes[i]).add(i);
            if(map.get(groupSizes[i]).size() == groupSizes[i]){
                result.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
            }
        }

        return result;
    }
}
