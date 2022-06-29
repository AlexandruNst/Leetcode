package Array.Easy._24_2176_Count_Equal_and_Divisible_Pairs_in_an_Array;

//T: O(n^2)
//S: O(1)
class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && i*j % k == 0) count++;

            }
        }

        return count;
    }
}
