package Array.Medium._3_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box;

//T: O(n)
//S: O(n)
//INTUITION: we go from left to right then right to left.
// each traverse, the result is the amount of steps it took to take the balls to the previous cell,
// plus the number of balls in the previous cell
class Solution2 {
    public int[] minOperations(String boxes) {
        char[] boxesChars = boxes.toCharArray();
        int[] result = new int[boxesChars.length];

        int prevOperations = 0;
        int prevBalls = 0;
        if(boxesChars[0] == '1') prevBalls = 1;

        for(int i = 1; i < boxesChars.length; i++){
            result[i] += prevBalls + prevOperations; // previous cell balls + how many shifts to get balls there
            prevOperations += prevBalls; // to get balls to THIS cell, we move each ball, each move is +1, so operation += balls
            if(boxesChars[i] == '1') prevBalls++; //if we have a ball in this cell, increase balls
        }

        //reset, same idea from right to left
        prevOperations = 0;
        prevBalls = 0;
        if(boxesChars[boxesChars.length - 1] == '1') prevBalls = 1;

        for(int i = boxesChars.length - 2; i >= 0; i--){
            result[i] += prevBalls + prevOperations;
            prevOperations += prevBalls;
            if(boxesChars[i] == '1') prevBalls++;
        }

        return result;
    }
}

/*
example from left to right
1 1 0 0

0 0 0 0
po 0
pb 1


0 1 0 0
po 1
pb 2

0 1 3 0
po 3
pb 2

0 1 3 5
po 5
pb 2

 */


