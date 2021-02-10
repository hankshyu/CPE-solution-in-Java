import java.math.BigInteger;
import java.util.Scanner;

public class backToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            BigInteger b1 = new BigInteger(scanner.next());
            BigInteger b2 = new BigInteger(scanner.next());
            System.out.println(b1.multiply(b2).multiply(new BigInteger("2")));

        }
    }
}
