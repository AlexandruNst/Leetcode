package Array.Easy._25_804_Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> transformations = new HashSet<>();
        String[] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(letters[c - 97]);
            }
            transformations.add(sb.toString());
        }

        return transformations.size();
    }
}
