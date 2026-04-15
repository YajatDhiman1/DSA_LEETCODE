class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        for(int i=0; i<nums.length; i++){
            int d=i;
            int range=0;
            int y=k;
            while(d<nums.length){
                if(nums[d] == 0){
                    if(y==0){
                        break;
                    }
                    range++;
                    y--;
                    d++;
                }
                else if(nums[d] == 1){
                    range++;
                    d++;
                }
            }
            max=Math.max(range,max);
        }
        return max;
    }
    
}