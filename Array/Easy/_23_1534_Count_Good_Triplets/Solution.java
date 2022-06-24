package Array.Easy._23_1534_Count_Good_Triplets;

//T: O(n^3) - can optimise this a little by doing the check in each for loop,
//            but it'll still be O(n^3)
//S: O(1)
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) count++;

                }
            }
        }
        return count;
    }
}
