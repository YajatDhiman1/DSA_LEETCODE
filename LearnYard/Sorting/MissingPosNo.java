class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int mis=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] == mis){
                    mis++;
                }else if(mis - nums[i] == 1){
                    continue;
                }else{
                    return mis;
                }
            }
        }
        return mis;
    }
}