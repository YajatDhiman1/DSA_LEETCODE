import java.util.*;

class Solution {
  public boolean isHappy(int n) {
    HashSet<Integer> seen=new HashSet<>();
    while(n != 1 && !seen.contains(n)){
      seen.add(n);
      n = getSum(n);
    }
    if(n==1){
      return true;
    }else{
      return false;
    }
  }
  static int getSum(int n){
    int sum=0;
    while(n != 0){
      int digit=n%10;
      sum += digit*digit;
      n=n/10;
    }
    return sum;
  }
}