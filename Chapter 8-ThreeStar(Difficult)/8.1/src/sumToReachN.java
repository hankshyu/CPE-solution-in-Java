import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sumToReachN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumToReachN sumToReachN = new sumToReachN();
        while (scanner.hasNext()) {
            long input = scanner.nextLong();
            Map<Integer, Integer> decompose = sumToReachN.decompose(input);
            long ans = 1;
            for (Map.Entry<Integer, Integer> entry : decompose.entrySet()) {
                if (entry.getKey() != 2) {

                    ans *= (entry.getValue() + 1);
                }
            }
            System.out.println(ans);
        }
    }

    public Map<Integer, Integer> decompose(long num) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int divider = 2;
        while (num != 1) {
            if (num % divider == 0) {
                if (map.containsKey(divider)) {
                    map.replace(divider, map.get(divider) + 1);
                } else {
                    map.put(divider, 1);
                }
                num /= divider;
            } else {
                divider++;
            }
        }
        return map;
    }
}
