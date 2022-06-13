package Array.Easy._7_1512_Number_of_Good_Pairs;
import java.util.Arrays;

//T: O(n logn)
// nlogn sort + n traverse
//S: O(1)
class Solution1 {
    public int numIdenticalPairs(int[] nums) {
         Arrays.sort(nums);
         int pairs = 0;
         int counter = 1;
         for(int i = 0; i < nums.length - 1; i++){
             if(nums[i] == nums[i+1]){
                 counter++;
             } else {
                 pairs += numberOfPairs(counter);
                 counter = 1;
             }
         }
         pairs += numberOfPairs(counter);

         return pairs;
    }

    private int numberOfPairs(int num){
        return num * (num - 1) / 2;
    }
}
