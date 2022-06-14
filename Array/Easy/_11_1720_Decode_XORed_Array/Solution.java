package Array.Easy._11_1720_Decode_XORed_Array;

//T: O(n)
//S: O(n)
class Solution {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length + 1;
        int[] result = new int[len];
        result[0] = first;
        for(int i = 1; i < len; i++){
            result[i] = result[i-1]^encoded[i-1];
        }

        return result;
    }
}
