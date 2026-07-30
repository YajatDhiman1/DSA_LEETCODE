import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int sb=sc.nextInt();
    for(int i=1; i<=sb; i++){
        System.out.println(n * i);
    }
  }
}