import java.util.Scanner;

public class necklace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] split = scanner.nextLine().split("\\s+");
            double vt = Double.parseDouble(split[0]);
            double v = Double.parseDouble(split[1]);
            if (vt == 0 && v == 0) {
                break;
            }
            double ans = vt / (2 * v);
            double margin=ans-(int)ans;
            if (margin == 0) {
                System.out.printf("%d",(int)ans);
            } else if (margin == 0.5) {
                System.out.println(0);
            } else if (margin < 0.5) {
                System.out.printf("%d",(int)ans);
            } else if (margin > 0.5) {
                System.out.printf("%d",(int)ans+1);
            }

        }
    }
}
