package Array.Medium._11_1877_Minimize_Maximum_Pair_Sum_in_Array;

import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i = 0; i < nums.length/2; i++){
            int sum = nums[i] + nums[nums.length - 1 - i];
            if(sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}
