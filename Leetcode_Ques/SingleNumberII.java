import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        for(int rr: map.keySet()){
            int freq=map.get(rr);
            if(freq==1){
                return rr;
            }
        }
        return 0;
    }
}