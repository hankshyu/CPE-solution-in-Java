import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcases = Integer.parseInt(scanner.nextLine());
        while (totalcases-- > 0) {

            String[] caseinfo = scanner.nextLine().split("\\s+");
            int sticklen = Integer.parseInt(caseinfo[0]);
            int antsnum = Integer.parseInt(caseinfo[1]);

            String[] split = scanner.nextLine().split("\\s+");
            int[] antposition = new int[split.length];
            for (int i = 0; i < antposition.length; i++) {
                antposition[i] = Integer.parseInt(split[i]);
            }

            ArrayList<Integer> smalllist = new ArrayList<>();
            ArrayList<Integer> biglist = new ArrayList<>();

            for (int i = 0; i < antposition.length; i++) {
                int positon = antposition[i];
                smalllist.add(Math.min(positon, sticklen - positon));
                biglist.add(Math.max(positon, sticklen - positon));

            }
            Collections.sort(smalllist);
            Collections.sort(biglist);
            System.out.println(smalllist.get(smalllist.size() - 1)+" "+biglist.get(biglist.size()-1));
        }
    }
}
