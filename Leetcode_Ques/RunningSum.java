class Solution {
    public int[] runningSum(int[] nums) {
        int run[]=new int[nums.length];
        int t=0;
        for(int i=0; i<nums.length; i++){
            t+=nums[i];
            run[i]=t;
        }
        return run;
    }
}