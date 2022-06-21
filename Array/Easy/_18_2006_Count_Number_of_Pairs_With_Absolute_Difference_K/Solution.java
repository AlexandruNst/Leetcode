package Array.Easy._18_2006_Count_Number_of_Pairs_With_Absolute_Difference_K;

//T: O(n)
//S: O(1)
class Solution {
    public int countKDifference(int[] nums, int k) {
        int pairs = 0;
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }

        for(int i = 1 ; i < 101 - k ; i++){
            pairs += freq[i] * freq[i+k];
        }

        return pairs;
    }
}
