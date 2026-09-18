import java.util.*;

public class ThreeNF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> sno = new ArrayList<>();
        ArrayList<Integer> fid = new ArrayList<>();
        ArrayList<String> fname = new ArrayList<>();
        ArrayList<Integer> rno = new ArrayList<>();

        for(int i=0; i<n; i++){
            int sn=sc.nextInt();
            int id=sc.nextInt();
            String name=sc.next();
            int no=sc.nextInt();

            if(!fid.contains(id)){
                sno.add(sn);
                fid.add(id);
                fname.add(name);
                rno.add(no);
            }
        }

        for(int i=0; i<fid.size(); i++){
            System.out.println(fid.get(i)+" "+fname.get(i)+" "+rno.get(i));
        }
    }
}
