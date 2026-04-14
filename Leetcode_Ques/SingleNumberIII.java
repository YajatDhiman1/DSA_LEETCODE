import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int arr[] = new int[2];
        int k=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i: map.keySet()){
            int freq = map.get(i);
            if(freq == 1){
                arr[k]=i;
                k++;
            }
        }
        return arr;
    }
}