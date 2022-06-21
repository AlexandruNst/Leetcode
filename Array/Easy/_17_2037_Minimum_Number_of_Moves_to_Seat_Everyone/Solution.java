package Array.Easy._17_2037_Minimum_Number_of_Moves_to_Seat_Everyone;

import java.util.Arrays;

//T: O(n log n)
//S: O(1)
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for(int i = 0; i < seats.length; i++){
            sum += Math.abs(seats[i] - students[i]);
        }

        return sum;
    }
}
