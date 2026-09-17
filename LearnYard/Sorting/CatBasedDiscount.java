import java.util.*;

public class CatBasedDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int discount=0;
        for(int i=0; i<n; i++){
            if(arr[i] >= 1000){
                discount = (int)Math.round((arr[i] / 100)* 15);
                arr[i] -= discount;
            }else{
                discount = (int)Math.round((arr[i] / 100)* 5);
                arr[i] -= discount;
            }
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
