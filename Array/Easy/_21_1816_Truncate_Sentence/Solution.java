package Array.Easy._21_1816_Truncate_Sentence;

//T: O(n) (?)
//S: O(n)
class Solution {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        String[] truncated = new String[k];
        System.arraycopy(split, 0, truncated, 0, k);
        String result = String.join(" ", truncated);
        return result;
    }
}
