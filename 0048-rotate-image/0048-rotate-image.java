class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        int res[][] = new int[n][m];

        int row=m-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                res[j][row] = matrix[i][j];
            }
            row--;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}