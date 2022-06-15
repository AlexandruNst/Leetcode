package Array.Easy._14_1773_Count_Items_Matching_a_Rule;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int itemsThatMatch = 0;

        int index;
        switch (ruleKey) {
            case "type": index = 0; break;
            case "color": index = 1; break;
            case "name": index = 2; break;
            default: index = -1;
        };

//        int index = switch (ruleKey) { //or fancy enhanced switch
//            case "type" -> 0;
//            case "color" -> 1;
//            case "name" -> 2;
//            default -> -1;
//        };

        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)) itemsThatMatch++;
        }

        return itemsThatMatch;
    }
}
