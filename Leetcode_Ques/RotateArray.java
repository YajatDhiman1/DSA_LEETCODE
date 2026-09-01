class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int arr[]=new int[len];
        int id=0;
        for(int i=len-k; i<len; i++){
            arr[id]=nums[i];
            id++;
        }
        int kk=id;
        for(int i=0; i<len-k; i++){
            arr[kk]=nums[i];
            kk++;
        }
        for(int ele=0; ele<len; ele++){
            nums[ele]=arr[ele];
        }
    }
}