package Array.Easy._20_1684_Count_the_Number_of_Consistent_Strings;

//T: O(n) where n is the number of chars in the String  array
//S: O(1)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] dictionary = new int[26];
        for(char c : allowed.toCharArray()){
            dictionary[c-97] = 1;
        }
        int result = 0;

        outerloop:
        for(String word : words){
            for(char c : word.toCharArray()){
                if(dictionary[c-97] == 0) continue outerloop;
            }
            result++;
        }
        return result;
    }
}