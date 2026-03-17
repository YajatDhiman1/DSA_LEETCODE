package GFG_Ques;
import java.util.*;

class Solution {
  public static void print_divisors(int n) {
  ArrayList<Integer> large = new ArrayList<>();
  for(int i = 1; i * i <= n; i++){
    if(n % i == 0){
      System.out.print(i + " ");
      if(i != n / i){
        large.add(n / i); 
      }
    }
  }
  for(int i = large.size() - 1; i >= 0; i--){
    System.out.print(large.get(i) + " ");
    }
  }
}
