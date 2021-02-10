import java.math.BigInteger;
import java.util.Scanner;

public class brickWallPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger[] bigIntegers = new BigInteger[51];
        bigIntegers[0]=BigInteger.ZERO;
        bigIntegers[1]=BigInteger.ONE;
        bigIntegers[2] = new BigInteger("2");
        for (int i = 3; i < bigIntegers.length; i++) {
            bigIntegers[i] = bigIntegers[i - 1].add(bigIntegers[i - 2]);
        }
        while (scanner.hasNextLine()) {
            int input=scanner.nextInt();
            System.out.println(bigIntegers[input]);

        }
    }
}
