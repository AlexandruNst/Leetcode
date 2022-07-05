package Array.Medium._13_1630_Arithmetic_Subarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//T: O(n * m)
//n - length of nums; m - length of l/r
//S: O(n * m)
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < m; i++){
            result.add(isArithmeticSubarray(nums, l[i], r[i]));
        }

        return result;
    }

    private boolean isArithmeticSubarray(int[] nums, int l, int r){
        int[] subArray = new int[r - l + 1];
        for(int i = l; i <= r; i++){
            subArray[i-l] = nums[i];
        }

        return isArithmetic(subArray);
    }

    private boolean isArithmetic(int[] arr){
        Arrays.sort(arr);
        int step = arr[1] - arr[0];
        boolean result = true;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] != step) result = false;
        }

        return result;
    }
}
