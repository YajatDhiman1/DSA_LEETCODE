import java.util.*;
public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(decimalToBinary(n));
  }
  public static int decimalToBinary(int m){
    if(m==0){
      return 0;
    }
    return decimalToBinary(m/2)*10+(m%10);
  }
}
