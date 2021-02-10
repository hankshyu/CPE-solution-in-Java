import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b2Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casecount=0;
        while (scanner.hasNext()) {
            casecount++;
            scanner.nextLine();
            String[] split = scanner.nextLine().split("\\s+");
            scanner.nextLine();
            int[] ints = new int[split.length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(split[i]);
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < ints.length; i++) {
                for (int j = i + 1; j < ints.length; j++) {
                    set.add(ints[i] + ints[j]);
                }
            }
            if (set.size() == (ints.length) * (ints.length - 1) / 2) {
                System.out.println("Case # " + casecount + ": It is a B2-Sequence.");
            } else {
                System.out.println("Case # " + casecount + ": It is not a B2-Sequence.");

            }
            System.out.println();


        }
    }
}
