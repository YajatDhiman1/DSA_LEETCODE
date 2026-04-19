import java.util.*;
class Solution {
    public int maxDistance(int[] colors) {
        int l=0;
        int r=colors.length-1;
        int dis=0;
        int max=0;
        while(l<r){
            if(colors[l] != colors[r]){
                dis=Math.abs(l-r);
                max=Math.max(dis,max);
                r--;
            }
            else{
                r--;
            }
        }
        l=0;
        r=colors.length-1;
        int max2=0;
        while(l<r){
            if(colors[l] != colors[r]){
                dis=Math.abs(l-r);
                max2=Math.max(dis,max2);
                l++;
            }
            else{
                l++;
            }
        }
        return Math.max(max,max2);
    }
}