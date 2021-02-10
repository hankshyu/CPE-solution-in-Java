import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class primetime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] preprime = new boolean[100010002];
        for (int i = 2; i < preprime.length; i++) {
            preprime[i] = true;
        }
        for (int i = 2; i < (int) Math.sqrt(preprime.length) + 1; i++) {
            if (preprime[i]) {
                int index = i + i;
                while (index < preprime.length) {
                    preprime[index] = false;
                    index += i;
                }
            }
        }
//        for (int i = 2; i <100 ; i++) {
//            System.out.println(i+":"+preprime[i]);
//        };


        while (scanner.hasNextLine()) {
            int low = scanner.nextInt();
            int high = scanner.nextInt();
            int numbers = 0;
            for (int i = low; i <= high; i++) {
                if (preprime[i * i + i + 41]) {
                    numbers++;
                }
            }

            System.out.printf("%.2f\n", (double) numbers*100 / (high - low + 1));

        }
    }

}

