package Array.Easy._9_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

//T: O(n^2)
//S: O(n)
class Solution1 {

    //brute force solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int num: nums){
                if(num < nums[i]){
                    result[i]++;
                }
            }
        }

        return result;
    }
}
