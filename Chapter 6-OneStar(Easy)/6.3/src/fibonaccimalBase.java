import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.Scanner;

public class fibonaccimalBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fib = new int[40];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int cases = Integer.parseInt(scanner.nextLine());
        while (cases-- > 0) {
            String ansstring = "";
            int target = Integer.parseInt(scanner.nextLine());
            int storetarget=target;
            boolean flag = false;
            for (int i = fib.length - 1; i >= 0; i--) {
                if (fib[i] <= target) {
                    flag = true;
                }
                if (flag) {
                    if (fib[i] <= target) {
                        target -= fib[i];
                        ansstring = ansstring + "1";
                    } else {
                        ansstring = ansstring + "0";
                    }
                }

            }
            System.out.println(storetarget + " = " + ansstring + " (fib)");
        }
    }
}
