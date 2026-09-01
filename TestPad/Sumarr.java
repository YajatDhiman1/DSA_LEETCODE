import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      for(int i=0; i<10; i++){
          int r=sc.nextInt();
          sum+=r;
      }
      System.out.println(sum);
  }
}