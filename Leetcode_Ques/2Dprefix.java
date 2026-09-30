class NumMatrix {
    int[][] m;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Extra row and column for easier calculation
        m = new int[rows + 1][cols + 1];

        // Build 2D prefix sum
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                m[i][j] = matrix[i - 1][j - 1]
                        + m[i - 1][j]
                        + m[i][j - 1]
                        - m[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return m[row2 + 1][col2 + 1]
             - m[row1][col2 + 1]
             - m[row2 + 1][col1]
             + m[row1][col1];
    }
}