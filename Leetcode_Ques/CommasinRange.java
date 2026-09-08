class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }else if(n >= 1000 && n <= 9999){
            return n-1000+1;
        }else if(n >= 10000 && n <= 99999){
            return n-1000+1;
        }else{
            return n-1000+1;
        }
    }
}