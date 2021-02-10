import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class iLoveBigNumbers {
    public static void main(String[] args) {
        ArrayList<BigInteger> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        list.add(BigInteger.ONE);
        list.add(BigInteger.ONE);
        for (int i = 2; i < 1000; i++) {
            list.add(list.get(list.size() - 1).multiply(new BigInteger(i + "")));

        }
        while (scanner.hasNextLine()) {
            int target = scanner.nextInt();
            String string=list.get(target).toString();
            int ans=0;
            for (int i = 0; i < string.length(); i++) {
                ans += string.charAt(i) - '0';
            }
            System.out.println(ans);
        }

    }
}
