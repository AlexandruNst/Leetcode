package Array.Medium._5_1637_Widest_Vertical_Area_Between_Two_Points_Containing_No_Points;

import java.util.Arrays;

//T: O(n)
//S: O(n)
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xs = new int[points.length];
        for(int i = 0; i < points.length; i++){
            xs[i] = points[i][0];
        }
        Arrays.sort(xs);
        int max = 0;
        for(int i = 0; i < xs.length - 1; i++){
            int d = xs[i + 1] - xs[i];
            if(d > max) max = d;
        }

        return max;
    }
}
