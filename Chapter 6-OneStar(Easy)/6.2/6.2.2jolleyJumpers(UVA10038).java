import java.util.HashSet;
import java.util.Scanner;

public class jolleyJumpers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split("\\s+");
            int cases = Integer.parseInt(split[0]);
            HashSet<Integer> integers = new HashSet<Integer>();
            for (int i = 0; i < cases-1; i++) {
                int candidate=Math.abs(Integer.parseInt(split[i + 1]) - Integer.parseInt(split[i + 2]));
                if (candidate > 0 && candidate <= cases - 1) {
                    integers.add(candidate);

                }
            }
            if (integers.size() == cases-1) {
                System.out.println("Jolley");

            } else {
                System.out.println("Not Jolley");
            }


        }
    }
}
