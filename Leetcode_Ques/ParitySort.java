import java.util.*;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int res[] = new int[nums.length];
        for(int i=0 ; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        for(int i=0; i<even.size(); i++){
            res[i]=even.get(i);
        }
        int g=even.size();
        for(int j=0; j<odd.size(); j++){
            res[g]=odd.get(j);
            g++;
        }
        
        return res;
    }
}
