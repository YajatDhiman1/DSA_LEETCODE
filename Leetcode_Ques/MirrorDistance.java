import java.util.*;
class Solution {
    public int mirrorDistance(int n) {
        int o=n;
        int rev=0;
        while(o != 0){
            int temp=o%10;
            rev*=10;
            rev+=temp;
            o/=10;
        }

        return Math.abs(rev-n);
    }
}