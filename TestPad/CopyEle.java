import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[10];
      for(int i=0; i<10; i++){
          int r=sc.nextInt();
          arr[i]=r;
      }
      for(int i=9; i>=0; i--){
          System.out.println(arr[i]);
      }
  }
}