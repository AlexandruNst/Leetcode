package Array.Easy._22_1913_Maximum_Product_Difference_Between_Two_Pairs;

import java.util.Arrays;

//T: O(n log n)
//S: O(1)
// Simple and intuitive, but takes more time because we sort the list
class Solution1 {
    public int maxProductDifference(int[] nums) {
         Arrays.sort(nums);
         return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
