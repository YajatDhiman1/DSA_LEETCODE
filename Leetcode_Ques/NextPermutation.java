class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)return;
        int flg=0;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                for(int y=nums.length-1; y>=i; y--){
                    if(nums[y] > nums[i-1]){
                        int temp=nums[i-1];
                        nums[i-1]=nums[y];
                        nums[y]=temp;
                        break;
                    }
                }
                ArrayList<Integer> l=new ArrayList<>();
                for(int w=nums.length-1; w>=i; w--){
                    l.add(nums[w]);
                }
                int rr=i;
                for(int ele: l){
                    nums[rr]=ele;
                    rr++;
                }
                flg=1;
                break;
            }
        }
        if(flg==0){
            Arrays.sort(nums);
        }
    }
}