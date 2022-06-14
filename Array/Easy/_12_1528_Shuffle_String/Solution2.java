package Array.Easy._12_1528_Shuffle_String;

import java.util.HashMap;
import java.util.Map;

// hashmap put and get are O(1) only if hash is really good. on average, it's higher. thus, slower solution
//T: O(n^2) (?)
//S: O(n)
class Solution2 {
    public String restoreString(String s, int[] indices) {

        Map<Integer, Character> map = new HashMap<>();
        char[] stringToChar = s.toCharArray(); //O(n)
        for(int i = 0; i < stringToChar.length; i++){
            map.put(indices[i], stringToChar[i]);
        }

        char[] characters = new char[s.length()];
        for(int i = 0; i < characters.length; i++){
            characters[i] = map.get(i);
        }

        String result = new String(characters);
        return result;
    }
}
