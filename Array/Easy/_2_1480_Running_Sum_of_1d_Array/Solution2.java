package Array.Easy._2_1480_Running_Sum_of_1d_Array;

// T: O(n)
// S: O(n)
class Solution2 {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
