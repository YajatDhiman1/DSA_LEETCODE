public class palindrome {
  public boolean isPalindrome(int x) {
    if(x<0) return false;
    int gg=0;
    int h=x;
    while(x != 0){
      gg*=10;
      int temp=x%10;
      gg+=temp;
      x/=10;
    }
    if(gg==h){
      return true;
    }else{
      return false;
    }
  }
}
