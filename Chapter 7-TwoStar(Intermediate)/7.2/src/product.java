import java.math.BigInteger;
import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            BigInteger b1 = new BigInteger(scanner.nextLine());
            BigInteger b2 = new BigInteger(scanner.nextLine());
            System.out.println(b1.multiply(b2));
        }
    }
}
