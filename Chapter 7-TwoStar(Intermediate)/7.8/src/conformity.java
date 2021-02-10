import java.util.*;

public class conformity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int students = Integer.parseInt(scanner.nextLine());
            if (students == 0) {
                break;
            }
            Map<TreeSet<String>, Integer> map = new HashMap<>();
            for (int i = 0; i < students; i++) {
                String[] split = scanner.nextLine().split("\\s+");
                TreeSet<String> newset = new TreeSet<>(Arrays.asList(split));

                if (map.containsKey(newset)) {
                    map.replace(newset, map.get(newset) + 1);
                } else {
                    map.put(newset, 1);
                }
            }

            int largenum = 0;
            for (Map.Entry<TreeSet<String>, Integer> entry : map.entrySet()) {
                int numofentry = entry.getValue();
                if (numofentry > largenum) {
                    largenum = numofentry;

                }
            }

            int addition=0;
            for (Map.Entry<TreeSet<String>, Integer> entry : map.entrySet()) {
                int numofentry = entry.getValue();
                if (numofentry== largenum) {
                    addition+=numofentry;

                }
            }
            System.out.println(addition);
        }

    }
}