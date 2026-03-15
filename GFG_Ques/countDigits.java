package GFG_Ques;

public class countDigits {
  static int evenlyDivides(int n) {
    int len=0;
    int no=n;
    while(no!=0){
      int tmp=no%10;
      if(tmp != 0){
        if(n % tmp == 0){
          len++;
        }
      }
      no/=10;
    }
    return len;
  }
}
