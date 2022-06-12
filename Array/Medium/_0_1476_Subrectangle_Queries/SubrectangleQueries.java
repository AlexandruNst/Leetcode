package Array.Medium._0_1476_Subrectangle_Queries;

class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) { // O(m*n)
        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                setValue(i, j, newValue);
            }
        }
    }

    public int getValue(int row, int col) { // O(1)
        return this.rectangle[row][col];
    }

    public void setValue(int row, int col, int value) { //helper, O(1)
        this.rectangle[row][col] = value;
    }
}
