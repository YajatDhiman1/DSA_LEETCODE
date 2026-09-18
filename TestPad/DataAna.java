import java.util.*;

public class DataAna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        int result = arr.stream()
                           .filter(x -> x % 2 == 0)
                           .map(x -> x * x)
                           .reduce(0, (a,b) -> a + b);

        System.out.println(result);
    }
}
