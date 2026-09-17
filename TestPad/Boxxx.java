import java.util.*;

public class Boxxx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt();
        float bb=sc.nextFloat();
        Box b1= new Box(aa, bb);
        b1.getValue();
    }
}
class Box{
    int first;
    float second;
    Box(int a, float b){
        first=a;
        second=b;
    }
    void getValue(){
        System.out.print(first+" "+second);
    }
}