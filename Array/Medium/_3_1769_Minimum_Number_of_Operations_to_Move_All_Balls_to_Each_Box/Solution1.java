package Array.Medium._3_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box;

//T: O(n^2)
//S: O(n)
class Solution1 {
    public int[] minOperations(String boxes) {
        char[] boxesChars = boxes.toCharArray();
        int[] result = new int[boxesChars.length];

        for(int i = 0; i < boxesChars.length; i++){
            for(int j = 0; j < boxesChars.length; j++){
                if(i != j && boxesChars[j] == '1'){
                    result[i] += Math.abs(i - j);
                }
            }
        }

        return result;
    }
}
