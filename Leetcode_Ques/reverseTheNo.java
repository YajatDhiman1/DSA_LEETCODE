public class reverseTheNo {
  public int reverse(int x) {
    int n=x;
    int res=0;
    while(n != 0){
      if(res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10){
        return 0;
      }
      res*=10;
      int temp=n%10;
      res+=temp;
      n/=10;
      }
    return res;     
  }
}
