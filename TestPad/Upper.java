import java.util.*;

public class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> str = new ArrayList<>();

        for(int i=0; i<n; i++){
            str.add(sc.next());
        }

        for(String ele: str){
            System.out.print(ele.toUpperCase()+" ");
        }
    }
}
