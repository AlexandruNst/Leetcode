package Array.Medium._9_2149_Rearrange_Array_Elements_by_Sign;

//T: O(n)
//S: O(n)
class Solution2 {
    public int[] rearrangeArray(int[] nums) {

         int len = nums.length;
         int[] result = new int[len];
         int index = 0;
         for(int num : nums){
             if(num > 0){
                 result[index] = num;
                 index += 2;
             }
         }

         index = 1;
         for(int num : nums){
             if(num < 0){
                 result[index] = num;
                 index += 2;
             }
         }

         return result;
    }
}