import java.util.Arrays;
import java.util.Scanner;

public class simpleDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            String[] split = s.split("\\s+");
            if (split.length == 1) {
                break;
            }
            int[] arr = new int[split.length - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            Arrays.sort(arr);
            int store = arr[0];
            for (int i = 0; i < arr.length; i++) {
                arr[i] -= store;
            }
            int curretgcd = arr[1];
            for (int i = 2; i < arr.length; i++) {
                curretgcd = gcd(curretgcd, arr[i]);
            }
            System.out.println(curretgcd);

        }
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
