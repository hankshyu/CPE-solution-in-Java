import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciFreeze {
    public static void main(String[] args) {
        ArrayList<BigInteger> list = new ArrayList<>();
        list.add(BigInteger.ZERO);
        list.add(BigInteger.ONE);
        list.add(BigInteger.ONE);
        for (int i = 0; i < 5000; i++) {
            BigInteger bi1 = list.get(list.size() - 1);
            BigInteger bi2 = list.get(list.size() - 2);
            list.add(bi1.add(bi2));

        }
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int num=scanner.nextInt();
            System.out.println("The fibonacci number for "+num+" is "+list.get(num));
        }


    }
}
