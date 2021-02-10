import java.math.BigInteger;
import java.util.Scanner;

public class oceanDeepMakeitShallow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                String string = scanner.nextLine();
                stringBuilder.append(string);
                if (string.charAt(string.length() - 1) == '#') {
                    break;
                }
            }
            String string=stringBuilder.toString();
            string = string.substring(0, string.length() - 1);
            BigInteger bi = new BigInteger(string, 2);
            if (bi.mod(new BigInteger("131071")).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }
    }
}
