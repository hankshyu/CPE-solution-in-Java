import java.math.BigInteger;
import java.util.Scanner;

public class superLongSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcase = Integer.parseInt(scanner.nextLine());
        while (totalcase-- > 0) {
            scanner.nextLine();
            int lenghofnum = Integer.parseInt(scanner.nextLine());
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            while (lenghofnum-- > 0) {
                String info = scanner.nextLine();
                str1.append(info.charAt(0) );
                str2.append(info.charAt(2) );
            }
            BigInteger int1 = new BigInteger(str1.toString());
            BigInteger int2 = new BigInteger(str2.toString());
            System.out.println(int1.add(int2));
            System.out.println();
        }
    }
}
