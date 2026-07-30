import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=2; i<=a; i++){
            if(b == 0){
                break;
            }
            int num=i;
            int isPrime=1;
            for(int u=2; u*u<=num; u++){
                if(num%u==0){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1){
                System.out.println(num);
                b--;
            }
        }
    }
}