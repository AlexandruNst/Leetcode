package Array.Medium._14_2221_Find_Triangular_Sum_of_an_Array;

class Solution {
    public int triangularSum(int[] nums) {
        return triSum(nums, nums.length);
    }

    public int triSum(int[] nums, int n){
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return (nums[0]+nums[1])%10;
        }

        for(int i = 0; i<n-1; i++){
            nums[i] = (nums[i]+nums[i+1])%10;
        }

        return triSum(nums, n-1);
    }
}
