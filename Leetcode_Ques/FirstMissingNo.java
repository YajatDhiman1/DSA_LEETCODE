import java.util.*;
class Solution {
  public int firstMissingPositive(int[] nums) {
    int mis=1;
    Arrays.sort(nums);
    for(int i=0; i<nums.length; i++){
      if(mis == nums[i]){
        mis++;
      }else if(nums[i] > mis){
        return mis;
      }else{
       continue;
      }
    }
  return mis;
  }
}