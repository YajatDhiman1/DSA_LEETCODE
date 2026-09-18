import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> bookid=new ArrayList<>();
        ArrayList<String> title=new ArrayList<>();
        ArrayList<String> author=new ArrayList<>();
        ArrayList<Integer> price=new ArrayList<>();

        for(int i=0; i<n; i++){
            bookid.add(sc.nextInt());
            title.add(sc.next());
            author.add(sc.next());
            price.add(sc.nextInt());
        }

        int fixedprice = sc.nextInt();

        for(int i=0; i<price.size(); i++){
            if(price.get(i) < fixedprice){
                bookid.remove(i);
                title.remove(i);
                author.remove(i);
                price.remove(i);
                i--;
            }
        }


        for(int i=0; i<price.size(); i++){
            System.out.println(bookid.get(i)+" "+title.get(i)+" "+author.get(i)+" "+price.get(i));   
        }
    }
}
