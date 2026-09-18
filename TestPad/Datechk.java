import java.util.*;
import java.time.LocalDate;


public class Datechk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate checkin = LocalDate.parse(sc.next());
        int total = sc.nextInt();
        int lived = sc.nextInt();
        LocalDate checkout = checkin.plusDays(total);
        int remaining = total - lived;

        System.out.println(checkout);
        System.out.println(remaining);
        System.out.println(checkout.getYear());
        System.out.println(checkout.getMonthValue());
    }
}
