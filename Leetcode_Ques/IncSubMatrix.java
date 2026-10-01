class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int ans[][] = new int[n][n];
        for(int[] query: queries){
            int row1=query[0];
            int col1=query[1];
            int row2=query[2];
            int col2=query[3];

            ans[row1][col1] += 1;
            // for right
            if((col2+1) < n){
                ans[row1][col2+1] -= 1;
            }
            // for bottom
            if((row2+1) < n){
                ans[row2+1][col1] -= 1;
            }
            // for bottom right
            if((row2 + 1) < n && (col2 + 1) < n){
                ans[row2+1][col2+1] += 1;
            }
        }

        // adding rows
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                ans[i][j] += ans[i][j-1];
            }
        }

        // adding cols
        for(int j=0; j<n; j++){
            for(int i=1; i<n; i++){
                ans[i][j] += ans[i-1][j];
            }
        }
        return ans;
    }
}