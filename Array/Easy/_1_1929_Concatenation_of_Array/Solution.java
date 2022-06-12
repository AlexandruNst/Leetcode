package Array.Easy._1_1929_Concatenation_of_Array;

// T: O(n)
// S: O(n)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];

        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }

        return ans;
    }
}
