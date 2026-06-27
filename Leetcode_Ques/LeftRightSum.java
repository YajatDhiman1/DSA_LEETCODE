class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum=0;
        int leftsum=0, rightsum=0;
        int res[]=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            totalsum+=nums[i];
        }

        rightsum=totalsum;
        int u=nums[0];

        for(int i=0; i<nums.length; i++){
            rightsum -= nums[i]; 
            res[i] = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
        }
        return res;
    }
}