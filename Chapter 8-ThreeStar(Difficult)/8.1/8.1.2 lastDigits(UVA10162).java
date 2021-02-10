import java.math.BigInteger;
import java.util.Scanner;

public class lastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals("0")) {
                break;
            }
            BigInteger bigInteger = new BigInteger(s);
            bigInteger = bigInteger.mod(BigInteger.TEN);
            long input = Long.parseLong(bigInteger.toString());
            System.out.println(addtion(input));
        }
    }


    public static int element(long element) {
        long elementstore = element;
        element %= 10;
        int finalans = 1;
        for (int i = 0; i < elementstore; i++) {
            finalans *= element;
            finalans %= 10;
        }
        return finalans;
    }

    public static int addtion(long upperbound) {
        int ans = 0;
        for (int i = 1; i <= upperbound; i++) {
            ans += element(i);
            ans %= 10;
        }
        return ans;
    }
}
