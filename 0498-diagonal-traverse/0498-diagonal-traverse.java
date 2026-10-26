class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int res[] = new int[n*m];
        boolean up=true;
        int row=0,col=0,i=0;

        while(row < m && col < n){
            if(up){
                while(row > 0 && col < n-1){
                    res[i++] = matrix[row][col];
                    row--;
                    col++;
                }
                res[i++] = matrix[row][col];
                if(col == n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(row < m-1 && col > 0){
                    res[i++] = matrix[row][col];
                    row++;
                    col--;
                }
                res[i++] = matrix[row][col];
                if(row == m-1){
                    col++;
                }else{
                    row++;
                }
            }
            up=!up;
        }

        return res;
    }
}