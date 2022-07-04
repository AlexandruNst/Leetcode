package Array.Easy._26_832_Flipping_an_Image;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            reverseAndInvertRow(row);
        }
        return image;
    }

    private void reverseAndInvertRow(int[] row){
        reverse(row);
        invert(row);
    }

    private void reverse(int[] row){
        for(int i = 0; i < row.length / 2; i++){
            int temp = row[i];
            row[i] = row[row.length - 1 - i];
            row[row.length - 1 - i] = temp;
        }
    }

    private void invert(int[] row){
        for(int i = 0; i < row.length; i++){
            if(row[i] == 0) row[i] = 1; else row[i] = 0;
        }
    }
}
