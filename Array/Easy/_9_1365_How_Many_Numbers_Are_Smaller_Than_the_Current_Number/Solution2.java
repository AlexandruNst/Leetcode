package Array.Easy._9_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//T: O(n log n)   n + n log n + n * 1 (assuming put is O(1)) + n =n log n
//S: O(n)
class Solution2 {

    // optimized solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            copy[i] = nums[i];
        }
        //or System.arraycopy(nums, 0, copy, 0, nums.length);

        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(copy[0], 0);
        int counter = 0;
        for(int i = 0; i < copy.length - 1; i++){
            if(copy[i] != copy[i+1]){
                map.put(copy[i+1], i+1);
                counter = i + 1;
            }
        }
        map.put(copy[copy.length - 1], counter);

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = map.get(nums[i]);
            // System.out.println(map.get(nums[i]));
        }

        return result;
    }
}
