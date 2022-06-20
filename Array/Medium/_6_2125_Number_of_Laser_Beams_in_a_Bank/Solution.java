package Array.Medium._6_2125_Number_of_Laser_Beams_in_a_Bank;

class Solution {
    public int numberOfBeams(String[] bank) {
        int index = 0;
        int[] lasersPerRow = new int[bank.length];
        for(String row : bank){
            int rowSum = 0;
            for(char cell : row.toCharArray()){
                if(cell == '1'){
                    rowSum++;
                }
            }
            if(rowSum > 0){
                lasersPerRow[index] = rowSum;
                index++;
            }

        }

        int lasers = 0;
        int previousRow = lasersPerRow[0];
        for(int i = 1; i < index; i++){
            int thisRow = lasersPerRow[i];
            lasers += previousRow * thisRow;
            previousRow = thisRow;
        }

        return lasers;
    }
}
