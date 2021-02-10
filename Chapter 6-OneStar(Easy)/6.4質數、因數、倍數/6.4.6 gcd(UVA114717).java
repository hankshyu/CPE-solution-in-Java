import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int input=scanner.nextInt();
            if (input == 0) {
                break;

            }
            long ans=0;
            for (int i = 1; i < input; i++) {
                for (int j = i + 1; j <= input; j++) {
                    ans += gcd(i, j);
                }
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
