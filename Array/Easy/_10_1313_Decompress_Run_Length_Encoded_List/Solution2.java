package Array.Easy._10_1313_Decompress_Run_Length_Encoded_List;

import java.util.ArrayList;
import java.util.List;

// technically takes longer, because arraylist.add takes O(1) in best case scenario, but O(n) when it needs to
// copy over the array to double the size. so this ends up taking n^2 sometimes, which makes it n^2, thus slower
//T: O(n^2)
//S: O(n)
class Solution2 {
    public int[] decompressRLElist(int[] nums) {


        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 0; j < freq; j++){
                result.add(val);
            }
        }

        int[] solution = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            solution[i] = result.get(i);
        }

        return solution;
    }
}