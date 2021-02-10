import java.util.Scanner;

public class allYouNeedIsLove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int casecount=0;
        while (cases-- > 0) {
            casecount++;
            int a = Integer.parseInt(scanner.nextLine(), 2);
            int b = Integer.parseInt(scanner.nextLine(), 2);
            System.out.print("Pair #"+casecount+": ");
            if (gcd(a, b) != 1) {
                System.out.println("All you need is love!");
            } else {
                System.out.println("Love is not all you need!");
            }
        }
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
