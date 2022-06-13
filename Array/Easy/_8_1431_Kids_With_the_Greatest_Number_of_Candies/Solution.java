package Array.Easy._8_1431_Kids_With_the_Greatest_Number_of_Candies;
import java.util.ArrayList;
import java.util.List;

//T: O(n)
//S: O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for(int candiesPerPerson : candies){
            if(candiesPerPerson > max) max = candiesPerPerson;
        }

        List<Boolean> result = new ArrayList<>();

        for(int candiesPerPerson : candies){
            if(candiesPerPerson + extraCandies >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
