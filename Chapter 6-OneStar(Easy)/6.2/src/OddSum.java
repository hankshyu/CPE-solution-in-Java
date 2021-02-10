import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casecount = 0;
        int totalcases = Integer.parseInt(scanner.nextLine());
        while (totalcases-- > 0) {
            casecount++;
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a % 2 == 0) {
                a++;
            }
            if (b % 2 == 0) {
                b--;
            }
            long ans = (b + a)/2 * (Math.abs(b - a) /2+ 1);
            System.out.println("Case "+casecount+": "+ans);

        }
    }
}
