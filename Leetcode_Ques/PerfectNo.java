class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 0)return false;
        int x=num-1;
        int sum=0;
        while(x > 0){
            if(num % x == 0){
                sum += x;
            }
            x--;
            if(sum > num)return false;
        }
        if(sum == num)return true;
        return false;
    }
}