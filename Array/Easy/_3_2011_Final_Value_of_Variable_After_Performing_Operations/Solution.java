package Array.Easy._3_2011_Final_Value_of_Variable_After_Performing_Operations;

// T: O(n)
//For String, StringBuffer, and StringBuilder, charAt() is a constant-time operation.
//For StringBuffer and StringBuilder, deleteCharAt() is a linear-time operation.
// S: O(1)
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation : operations){
            if(operation.charAt(0) == '-' || operation.charAt(2) == '-'){
                x--;
            } else{
                x++;
            }
        }

        return x;
    }
}
