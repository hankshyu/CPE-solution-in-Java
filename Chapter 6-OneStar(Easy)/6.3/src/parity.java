import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            System.out.print("The parity of "+toBinaryString(num)+" is ");
            System.out.print(numOfOne(toBinaryString(num)));
            System.out.println(" (mod 2).");
        }
    }

    public static int numOfOne(String string) {
        int ans = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }

    public static String toBinaryString(int num) {

        String ans = "";
        while (num != 0) {
            if (num % 2 == 0) {
                ans = "0" + ans;
            } else {
                ans = "1" + ans;
            }
            num /= 2;
        }
        return ans;
    }
}
