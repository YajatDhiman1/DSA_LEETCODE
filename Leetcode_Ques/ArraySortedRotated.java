class Solution {
    public boolean check(int[] nums) {
        int findx=1;
        int idx=0;
        while(idx < nums.length-1 && nums[idx] <= nums[idx+1]){
            idx++;
            findx++;
        }
        
        if(findx == nums.length)return true;

        int x=nums.length-findx;
        int B[]=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            B[i]=nums[i];
        }
        Arrays.sort(B);

        int C[]=new int[B.length];
        for(int i=0; i<B.length; i++){
            C[i] = B[(i+x) % B.length];
        }

        if(Arrays.equals(nums, C)){
            return true;
        }
        return false;
    }
}