class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int r: row){
            for(int i=0; i<matrix[r].length; i++){
                matrix[r][i] = 0;
            }
        }

        for(int c: col){
            for(int i=0; i<matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
    }
}