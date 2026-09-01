class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int[] res=new int[2];
        int rep=0;
        int miss=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(set.contains(grid[i][j])){
                    rep=grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        int sum=0;
        for(int i=1; i<=set.size()+1; i++){
            sum+=i;
        }
        int set_sum=0;
        for(int i:set){
            set_sum+=i;
        }
        miss=sum-set_sum;
        res[0]=rep;
        res[1]=miss;
        return res;
    }
}