class Main{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int n = sc.nextInt();
            System.out.println(Result.evenDigits(n));
        }
    }
}
class Result{
    public static int evenDigits(int n){
        if(n==0) return 0;
        int digit = n %10;
        int rem = evenDigits(n/10);
        if(digit%2==0){
            return rem*10 + digit;
        }
        else {return rem;}
    }
}