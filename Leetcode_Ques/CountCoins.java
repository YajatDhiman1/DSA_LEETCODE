public class CountCoins {
  class Solution {
    public int arrangeCoins(int n) {
        long sum=0;
        int i=1;
        int row=0;
        while(sum < n ){
            sum +=i;
            i++;
            row++; 
        }
        if(n == sum){
            return row;
        }
        return row-1;
    }
  }
}
