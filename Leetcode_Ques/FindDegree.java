class Solution {
    public int[] findDegrees(int[][] matrix) {
        int res[] = new int[matrix.length];
        int l=matrix[0].length;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<l; j++){
                res[i] += matrix[i][j];
            }
        }
        return res;
    }
}