package Array.Easy._12_1528_Shuffle_String;

//T: O(n)
//String.toCharArray() runs in linear time
//S: O(n)
class Solution1 {
    public String restoreString(String s, int[] indices) {


         char[] characters = new char[s.length()];
         char[] stringToChar = s.toCharArray(); //O(n)
         for(int i = 0; i < stringToChar.length; i++){ //O(n)
             characters[indices[i]] = stringToChar[i];
         }

         String result = new String(characters); //O(n)
         return result;
    }
}
