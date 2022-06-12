package Array.Easy._5_2114_Maximum_Number_of_Words_Found_in_Sentences;

// T: O(n)
// S: O(1)
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence : sentences){
            int words = calcNumberOfWords(sentence);
            if (words > maxWords) maxWords = words;
        }

        return maxWords;
    }

    private int calcNumberOfWords(String sentence){
        return sentence.split(" ").length;
    }
}
