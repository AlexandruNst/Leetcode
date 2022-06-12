package Array.Easy._6_1470_Shuffle_the_Array;

// T: O(n)
// S: O(n)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] shuffled = new int[len];
        int index = 0;
        for(int i = 0; i < n; i++){
            shuffled[index++] = nums[i];
            shuffled[index++] = nums[i + n];
        }

        return shuffled;
    }
}