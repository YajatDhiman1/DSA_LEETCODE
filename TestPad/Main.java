import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int sq = n * n;
            int temp = sq;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            boolean found = false;

            for (int i = 1; i < digits; i++) {
                int power = (int) Math.pow(10, i);

                int right = sq % power;
                int left = sq / power;

                if (right != 0 && left + right == n) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}