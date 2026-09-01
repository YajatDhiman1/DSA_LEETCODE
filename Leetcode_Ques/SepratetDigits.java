class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> no=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            while(nums[i] > 9){
                int tmp=nums[i]%10;
                no.add(tmp);
                nums[i]=nums[i]/10;
            }
            list.add(nums[i]);
            for(int k=no.size()-1; k>=0; k--){
                list.add(no.get(k));
            }
            no.clear();
        }
        int arr[]=new int[list.size()];
        for(int u=0;u<list.size();u++){
            arr[u]=list.get(u);
        }
        return arr;
    }
}