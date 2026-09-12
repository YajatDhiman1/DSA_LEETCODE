class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                l.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                l.add(pivot);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > pivot){
                l.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        for(int ele=0; ele<l.size(); ele++){
            res[ele]=l.get(ele);
        }
        return res;
    }
}