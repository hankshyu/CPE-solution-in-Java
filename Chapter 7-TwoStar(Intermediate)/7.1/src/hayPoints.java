import java.util.HashMap;
import java.util.Scanner;

public class hayPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");
        int dictionarynum = Integer.parseInt(split[0]);
        int paragraphnum = Integer.parseInt(split[1]);
        HashMap<String, Integer> map = new HashMap<>();
        while (dictionarynum-- > 0) {
            String[] split1 = scanner.nextLine().split("\\s+");
            String index = split1[0];
            int value = Integer.parseInt(split1[1]);
            map.put(index, value);

        }
        while (paragraphnum-- > 0) {
            int price=0;
            while (true) {
                String read= scanner.nextLine();
                if (read.equals(".")) {
                    break;
                }
                String[] parsplit = read.split("\\s+");
                for (String st : parsplit) {
                    if (map.containsKey(st)) {
                        price += map.get(st);
                    }
                }
            }
            System.out.println(price);
        }
    }
}
