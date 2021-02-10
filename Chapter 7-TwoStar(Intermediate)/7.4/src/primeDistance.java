import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class primeDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            int small = scanner.nextInt();
            int big = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 2; i < big + 10; i++) {
                String st = Integer.toString(i);
                BigInteger bi = new BigInteger(st);
                if (bi.isProbablePrime(1)) {
                    arrayList.add(i);
                }
            }
            System.out.println("small = " + small);
            System.out.println("big = " + big);
            ArrayList<Integer> primes = new ArrayList<>();
            for (int p : arrayList) {
                if (p >= small && p <= big) {
                    primes.add(p);
                }
            }
            if (primes.size()<=1) {
                System.out.println("There are no adjacent primes");
                continue;
            }
            //find small gap
            int smalldistance = Integer.MAX_VALUE;
            int big1 = 0;
            int small1 = 0;
            for (int i = 0; i < primes.size() - 1; i++) {
                int testd = primes.get(i + 1) - primes.get(i);
                if (testd < smalldistance) {
                    smalldistance = testd;
                    big1 = primes.get(i + 1);
                    small1 = primes.get(i);
                }
            }
            //find big gap
            int bigdistance = -1;
            int big2 = 0;
            int small2 = 0;
            for (int i = 0; i < primes.size() - 1; i++) {
                int testd = primes.get(i + 1) - primes.get(i);
                if (testd > bigdistance) {
                    bigdistance = testd;
                    big2 = primes.get(i + 1);
                    small2 = primes.get(i);
                }
            }
            System.out.println(primes);

            System.out.println(small1 + "," + big1 + "are the closest, " + small2 + "," + big2 + "are most distant.");


        }
    }
}
