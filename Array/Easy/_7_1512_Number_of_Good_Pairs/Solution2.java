package Array.Easy._7_1512_Number_of_Good_Pairs;

//T: O(n)
//S: O(1)
class Solution2 {
    public int numIdenticalPairs(int[] nums) {

        // takes advantage of the fact that we know elements in nums <= 100
        int[] counter = new int[101];
        int pairs = 0;
        for(int num : nums){
            counter[num]++;
        }
        for(int count : counter){
            if(count != 0){
                pairs += numberOfPairs(count);
            }
        }

        return pairs;
    }

    private int numberOfPairs(int num){
        return num * (num - 1) / 2;
    }
}
