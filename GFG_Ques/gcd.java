package GFG_Ques;
public class gcd {
  static boolean armstrongNumber(int n) {
    int h=n;
    int len=0;
    int sum=0;
    while(h != 0){
      h /= 10;
      len++;
    }
    h=n;
    while(h != 0){
      int temp=h%10;
      sum += (int) Math.pow(temp, len);
      h /= 10;
    }
    if(sum == n){
      return true;
    }else{
      return false;
    }
  }
}
