import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcases = scanner.nextInt();
        while (totalcases-- > 0) {
            int numofnumbers=scanner.nextInt();
            int K=scanner.nextInt();
            int[] numbers = new int[numofnumbers];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]=scanner.nextInt();
            }
            ArrayList<HashSet<Integer>> arrayList = new ArrayList<>();
            HashSet<Integer> setone = new HashSet<>();
            setone.add(numbers[0]);
            arrayList.add(setone);

            for (int i = 1; i < numofnumbers; i++) {
                HashSet<Integer> oldset = arrayList.get(i - 1);
                HashSet<Integer> newset = new HashSet<>();
                for (Integer integer : oldset) {

                    newset.add((integer +K+numbers[i])%K);
                    newset.add((integer +K-numbers[i])%K);

                }
                arrayList.add(newset);
            }
            HashSet<Integer> integers = arrayList.get(arrayList.size() - 1);
            boolean divisible=false;
            for (Integer inte : integers) {
                if (inte == 0) {
                    divisible=true;
                }
            }
            if (divisible) {
                System.out.println("Divisible");
            } else {
                System.out.println("Not Divisible");
            }

        }
    }
}
