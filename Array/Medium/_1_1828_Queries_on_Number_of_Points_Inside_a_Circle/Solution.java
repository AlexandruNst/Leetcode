package Array.Medium._1_1828_Queries_on_Number_of_Points_Inside_a_Circle;

//T: O(n*m) n - points, m - queries
//S: O(m) m - queries
class Solution {

    // brute force-y
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] result = new int[queries.length];
        int index = 0;

        for(int[] query : queries){

            int x1 = query[0];
            int y1 = query[1];
            int d = query[2];

            for(int[] point : points){
                int x2 = point[0];
                int y2 = point[1];

                if(d >= distance(x1, y1, x2, y2)){
                    result[index]++;
                }
            }
            index++;
        }

        return result;
    }

    private double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
