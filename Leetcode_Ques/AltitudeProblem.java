class Solution {
    public int largestAltitude(int[] gain) {
       int max=0;
       int em=0;
       for(int i=0; i<gain.length; i++){
        em+=gain[i];
        max=Math.max(max,em);
       } 
       return max;
    }
}