import java.util.*;

public class TreeSetttt {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }

        int target=sc.nextInt();
        Integer g = set.lower(target);

        if(g == null){
            System.out.println(-1);
        }else{
            System.out.println(g);
        }
    }
}
