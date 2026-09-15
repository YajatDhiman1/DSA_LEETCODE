import java.util.*;
public class Discount{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int o_am=sc.nextInt();
        double discount_perc=sc.nextDouble();
        double service_perc=sc.nextDouble();


        double discount = o_am * discount_perc/100;
        double amt=o_am-discount;
        double servicechrge= amt * (service_perc/100);
        double finalll=amt + servicechrge;

        System.out.printf("%.2f\n",finalll);
    }
}