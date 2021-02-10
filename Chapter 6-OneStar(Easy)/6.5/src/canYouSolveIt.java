import java.util.Scanner;

public class canYouSolveIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcases = Integer.parseInt(scanner.nextLine());
        int casecount=0;

        while (totalcases-- > 0) {
            casecount++;
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();


            System.out.print("Case "+casecount+": ");
            System.out.println(Math.abs(addtotal(x1, y1) - addtotal(x2, y2)));

        }
    }

    public static int addprelayers(int sum) {
        int ans = 0;
        for (int i = 0; i <= sum ; i++) {
            ans += i;
        }
        return ans;
    }

    public static int addtotal(int x, int y) {
        int ans = 0;
        ans += addprelayers(x + y);
        ans+=x;
        return ans;
    }
}
