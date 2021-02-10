import java.util.Scanner;
import java.util.TreeMap;

public class HardwoodSpecies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totolcases = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        while (totolcases-- > 0) {
            TreeMap<String, Integer> treeMap = new TreeMap<>();
            int totaltree=0;
            while (true) {
                String tree= scanner.nextLine();
                if (tree.isEmpty()) {
                    break;
                }
                totaltree++;
                if (treeMap.containsKey(tree)) {
                    treeMap.put(tree, treeMap.get(tree) + 1);

                } else {
                    treeMap.put(tree, 1);
                }
            }
            for (String s : treeMap.keySet()) {
                System.out.print(s + " ");
                System.out.printf("%.4f", treeMap.get(s) * 100.00 / totaltree);
                System.out.println();
            }
        }
    }
}
