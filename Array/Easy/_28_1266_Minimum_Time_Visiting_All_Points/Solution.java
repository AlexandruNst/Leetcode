package Array.Easy._28_1266_Minimum_Time_Visiting_All_Points;

//T: O(n)
//S: O(1)
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;
        int[] point1 = points[0];
        for(int i = 1; i < points.length; i++){
            int[] point2 = points[i];
            seconds += calcSecondsFromTo(point1, point2);
            point1 = point2;
        }
        return seconds;
    }

    private int calcSecondsFromTo(int[] point1, int[] point2){
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));

    }
}
