package Array.Easy._4_1672_Richest_Customer_Wealth;

// T: O(m*n)
// S: O(1)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customer : accounts){
            int wealth = calculateWealth(customer);
            if(wealth > maxWealth) maxWealth = wealth;
        }

        return maxWealth;
    }

    private int calculateWealth(int[] banks){
        int wealth = 0;
        for(int bank : banks){
            wealth += bank;
        }

        return wealth;
    }
}
