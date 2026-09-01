class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        int i;
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int j=nums.length-1; j>=0; j--){
            arr[i]=nums[j];
            i++;
        }
        return arr;
    }
}