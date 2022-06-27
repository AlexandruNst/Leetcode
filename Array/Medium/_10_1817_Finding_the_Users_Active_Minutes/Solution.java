package Array.Medium._10_1817_Finding_the_Users_Active_Minutes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] log : logs){
            Set<Integer> setToBeAdded = map.getOrDefault(log[0], new HashSet<Integer>());
            setToBeAdded.add(log[1]);
            map.put(log[0], setToBeAdded);
        }
        int[] answer = new int[k];
        for(Set<Integer> value : map.values()){
            int setSize = value.size();
            answer[--setSize]++;
        }

        return answer;
    }
}
