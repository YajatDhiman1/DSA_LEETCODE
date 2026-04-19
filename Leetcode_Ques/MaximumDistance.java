import java.util.*;
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int dis=0;
        int max=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j] ){
                dis=j-i;
                max=Math.max(dis,max);
                j++;
            }
            else if(nums1[i] > nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return max;
    }
}