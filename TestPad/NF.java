import java.util.*;

public class NF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            String book = sc.next();
            String[] books = book.split(",");

            for(String ele: books){
                System.out.println(id+" - "+ele);
            }
        }
    }
}
