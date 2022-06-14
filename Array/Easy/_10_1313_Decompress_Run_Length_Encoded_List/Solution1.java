package Array.Easy._10_1313_Decompress_Run_Length_Encoded_List;

//T: O(n)
//S: O(n)
class Solution1 {
    public int[] decompressRLElist(int[] nums) {

        // O(n)
         int len = 0;
         for(int i = 0; i < nums.length; i+=2){
             len += nums[i];
         }

         int[] result = new int[len];
         int index = 0;
         for(int i = 0; i < nums.length; i+=2){
             int freq = nums[i];
             int val = nums[i+1];
             for(int j = 0; j < freq; j++){
                 result[index] = val;
                 index++;
             }
         }

         return result;
    }
}
