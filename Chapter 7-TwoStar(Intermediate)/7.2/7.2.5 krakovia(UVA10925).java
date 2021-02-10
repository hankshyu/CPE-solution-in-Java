import java.math.BigInteger;
import java.util.Scanner;

public class krakovia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casecount=0;
        while (true) {
            casecount++;
            String[] split = scanner.nextLine().split("\\s+");
            int bills = Integer.parseInt(split[0]);
            int splits = Integer.parseInt(split[1]);
            BigInteger zero = BigInteger.ZERO;
            while (bills-- > 0) {
                zero = zero.add(new BigInteger(scanner.nextLine()));
            }
            System.out.print("Bill #"+casecount+" costs "+zero+": each-friend should pay ");

            System.out.println(zero.divide(new BigInteger(splits + "")));
        }
    }
}
