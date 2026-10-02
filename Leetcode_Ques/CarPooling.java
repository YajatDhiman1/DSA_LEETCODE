class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passengers = new int[1002];
        for(int i=0; i<trips.length; i++){
            passengers[trips[i][1]] += trips[i][0];
            passengers[trips[i][2]] -= trips[i][0]; 
        }

        int sum = 0;
        for(int i=0; i<=1001; i++){
            sum += passengers[i];
            if(sum > capacity){
                return false;
            }
        }

        return true;
    }
}