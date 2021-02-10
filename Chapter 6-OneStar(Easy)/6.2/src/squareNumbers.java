import java.math.BigInteger;
import java.util.Scanner;

public class squareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigInteger low = new BigInteger(scanner.next());
            BigInteger high = new BigInteger(scanner.next());
            if (low.equals(BigInteger.ZERO) && high.equals(BigInteger.ZERO)) {
                break;
            }
            int counter=0;
            for (BigInteger i = BigInteger.ONE; ; i=i.add(BigInteger.ONE)) {
                BigInteger compare = i.pow(2);
                if (compare.compareTo(high) > 0) {
                    break;
                }
                if (compare.compareTo(low) >= 0 && compare.compareTo(high) <= 0) {
                    counter++;
                }

            }
            System.out.println(counter);
        }
        }

        }


