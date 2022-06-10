package Array.Easy._1920_Build_Array_from_Permutation;

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
