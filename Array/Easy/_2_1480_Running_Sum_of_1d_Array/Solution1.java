package Array.Easy._2_1480_Running_Sum_of_1d_Array;

// T: O(n)
// S: O(n)
class Solution1 {
    public int[] runningSum(int[] nums) {
         int len = nums.length;
         int[] result = new int[len];

         int sum = 0;
         for(int i = 0; i < len; i++){
             sum += nums[i];
             result[i] = sum;
         }

         return result;
    }
}
