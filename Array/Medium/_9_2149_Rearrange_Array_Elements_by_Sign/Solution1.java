package Array.Medium._9_2149_Rearrange_Array_Elements_by_Sign;

//T: O(n)
//S: O(n)
class Solution1 {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] positives = new int[len/2];
        int[] negatives = new int[len/2];
        int iPos = 0;
        int iNeg = 0;

        for(int num : nums){
            if(num > 0) positives[iPos++] = num;
            else negatives[iNeg++] = num;
        }

        int [] result = zipArrays(positives, negatives);
        return result;
    }

    private int[] zipArrays(int[] positives, int[] negatives){
        int[] result = new int[positives.length * 2];

        for(int index = 0; index < positives.length; index++){
            result[index * 2] = positives[index];
            result[index * 2 + 1] = negatives[index];
        }

        return result;
    }
}
