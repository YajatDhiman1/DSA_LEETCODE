class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        int h=0;
        int g=matrix.length-1;;
        for(int i=0; i<matrix.length; i++){
            h=0;
            for(int j=0; j<matrix[i].length; j++){
                arr[h][g] = matrix[i][j];
                h++;
            }
            g--;
        }

        for(int r=0; r<arr.length; r++){
            for(int k=0; k<arr[r].length; k++){
                matrix[r][k] = arr[r][k];
            }
        }

    }
}