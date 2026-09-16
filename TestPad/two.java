package PRACTICE;
import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(sc.nextInt());
            n--;
        }
        int no = sc.nextInt();

        for(int i=0; i<list.size(); i++){
            if(list.get(i) % no == 0){
                list.remove(i);
                i--;
            }
        }
        if(list.size() != 0){
            for(int ele: list){
                System.out.print(ele+" ");
            }
        }else{
            System.out.println(-1);
        }
    }
}
