package Array.Medium._2_807_Max_Increase_to_Keep_City_Skyline;

//T: O(n^2)
//S: O(n)
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int[] maxPerRows = new int[n];
        int[] maxPerColumns = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maxPerRows[i]    = Math.max(maxPerRows[i], grid[i][j]);
                maxPerColumns[i] = Math.max(maxPerColumns[i], grid[j][i]);
            }
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += Math.min(maxPerRows[i], maxPerColumns[j]) - grid[i][j];
            }
        }

        return sum;
    }
}
