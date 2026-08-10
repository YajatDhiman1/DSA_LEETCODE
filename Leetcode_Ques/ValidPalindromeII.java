class Solution {
    public boolean validPalindrome(String s) {
        int left=0, right=s.length()-1;
        int del=0;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return CP(s,left+1,right) || CP(s,left, right-1);
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean CP(String s, int a, int b){
        while(a < b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }else{
                a++;
                b--;
            }
        }
        return true;
    }
}