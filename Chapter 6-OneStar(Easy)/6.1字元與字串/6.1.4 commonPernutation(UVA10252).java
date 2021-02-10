import java.util.Scanner;

public class commonPernutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int[][] count = new int[2][300];
            String str1 = scanner.nextLine().toLowerCase();
            String str2 = scanner.nextLine().toLowerCase();

            for (int i = 0; i < str1.length(); i++) {
                count[0][str1.charAt(i)]++;

            }

            for (int i = 0; i < str2.length(); i++) {
                count[1][str2.charAt(i)]++;

            }
            for (int i = 'a'; i <= 'z'; i++) {
                if (count[0][i] !=0&& count[1][i] != 0) {
                    for (int j = 0; j < Math.min(count[0][i], count[1][i]); j++) {
                        System.out.print((char)i);
                    }
                }
            }
            System.out.println();
        }
    }
}
