class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int len=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<len-1; i++){
            int y=0;
            int ptr=i+1;
            while(ptr < len){
                if(nums[i] > nums[ptr]){
                    y++;
                }
                ptr++;
            }
            ans.add(y);
        }
        ans.add(0);
        return ans;
    }
}