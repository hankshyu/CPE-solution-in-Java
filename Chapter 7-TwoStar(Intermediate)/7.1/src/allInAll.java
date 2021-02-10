import java.util.Scanner;

public class allInAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split("\\s+");
            String longstr="";
            String shortstr="";
            if (split[0].length() > split[1].length()) {
                longstr = split[0] + "0";
                shortstr = split[1] + "0";
            } else {
                shortstr = split[0] + "0";
                longstr = split[1] + "0";
            }
            if (paring(longstr, shortstr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

    public static boolean paring(String longstr, String shortstr) {
        int i=0;
        int j=0;
        while (i != longstr.length() - 1 && j != shortstr.length() - 1) {
            if (longstr.charAt(i) == shortstr.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }

        }
        if (j == shortstr.length() - 1||shortstr.length()==j) {
            return true;
        } else {
            return false;
        }
    }
}
