package Array.Easy._16_1588_Sum_of_All_Odd_Length_Subarrays;

class Solution1 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 1; i <= arr.length; i+=2){
            sum += slidingWindowSum(i, arr);
        }

        return sum;
    }

    private int slidingWindowSum(int windowSize, int[] arr){
        int accSum = 0;
        int window = 0;
        int i = 0;
        for(; i < windowSize; i++){
            window += arr[i];
        }
        int firstIndex = 0;
        accSum += window;
        for(; i < arr.length; i++){
            window -= arr[firstIndex];
            window += arr[i];
            firstIndex++;
            accSum += window;
        }

        return accSum;
    }
}
