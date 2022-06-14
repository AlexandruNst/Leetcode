package Array.Easy._13_1389_Create_Target_Array_in_the_Given_Order;

import java.util.ArrayList;
import java.util.List;

//T: O(n^2)
// ArrayList add is linear at worst, so O(n^2)
//S: O(n)
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> targetArrayList = new ArrayList<>();
        for(int i = 0; i < index.length; i++){
            targetArrayList.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for(int i = 0; i < targetArrayList.size(); i++){
            target[i] = targetArrayList.get(i);
        }

        return target;
    }
}
