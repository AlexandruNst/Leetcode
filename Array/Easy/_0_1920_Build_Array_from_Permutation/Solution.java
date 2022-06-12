package Array.Easy._0_1920_Build_Array_from_Permutation;

// T: O(n)
// S: O(n)
class Solution {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] solution = new int[len];
        for(int i = 0; i < len; i++){
            solution[i] = nums[nums[i]];
        }
        return solution;
    }
}
