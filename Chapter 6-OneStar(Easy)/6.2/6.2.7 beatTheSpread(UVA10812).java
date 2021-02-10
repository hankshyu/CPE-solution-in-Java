import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class beatTheSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        while (cases-- > 0) {
            boolean flag=true;
            double a = Long.parseLong(scanner.next());
            double b = Long.parseLong(scanner.next());
            double max = (a + b) / 2;
            double min = (a - b) / 2;
            if ((long) max - max != 0||(long) min - min != 0) {
                flag=false;
            }
            if (max<0||min<0) {
                flag=false;
            }
            if (flag) {
                System.out.printf("%.0f %.0f\n", max, min);

            } else {
                System.out.println("impossible");
            }
        }
    }
}
