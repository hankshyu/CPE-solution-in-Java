import java.math.BigInteger;
import java.util.Scanner;

public class SimplyErimp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String original=scanner.nextLine();
            BigInteger org = new BigInteger(original);
            BigInteger changed = new BigInteger(reverseString(original));

            if (org.isProbablePrime(1)) {

                if (changed.isProbablePrime(1)&&!org.equals(changed)) {
                    System.out.println(org + "is emirp.");
                } else {
                    System.out.println(org+" is prime.");
                }
            } else {
                System.out.println(org+ " is not prime.");
            }

        }
    }

    public static String reverseString(String string) {
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            ans += string.charAt(string.length() - i - 1);
        }
        return ans;
    }

}
