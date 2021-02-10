import java.util.Scanner;

public class aMidSummerNightsDream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int ans1 = 0;
            int ans2 = 0;
            int ans3 = 0;

            int numbers = scanner.nextInt();
            int[] arr = new int[numbers];
            for (int i = 0; i < numbers; i++) {
                arr[i] = scanner.nextInt();
            }

            if (numbers % 2 == 0) {
                ans1 = arr[numbers / 2 - 1];
                ans2 = 2;
                ans3 = arr[numbers / 2] - arr[numbers / 2 - 1] + 1;

            } else {
                ans1 = arr[numbers / 2];
                ans2 = 1;
                ans3 = 1;

            }
            System.out.println(ans1 + " " + ans2 + " " + ans3);
        }
    }

}
