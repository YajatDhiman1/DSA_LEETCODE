class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 0){
                list.add(0);
            }
        }
        for(int j=0;j<nums.length; j++){
            if(nums[j] == 1){
                list.add(1);
            }
        }
        for(int k=0;k<nums.length; k++){
            if(nums[k] == 2){
                list.add(2);
            }
        }
        Integer[] arr = list.toArray(new Integer[list.size()]);
        for(int y=0; y<arr.length; y++){
            nums[y] = arr[y];
        }
    }
}