import java.util.Arrays;
import java.util.Scanner;

public class ebAltoSaxophonePlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcase = Integer.parseInt(scanner.nextLine());
        while (totalcase-- > 0) {
            String play = scanner.nextLine();
            if (play.isEmpty()) {
                System.out.println("0 0 0 0 0 0 0 0 0 0");
                continue;
            }
            boolean[][] arr = new boolean[10][play.length()];
            for (int i = 0; i < play.length(); i++) {
                char ch = play.charAt(i);
                switch (ch) {
                    case 'c':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        arr[8 - 1][i] = true;
                        arr[9 - 1][i] = true;
                        arr[10 - 1][i] = true;
                        break;

                    case 'd':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        arr[8 - 1][i] = true;
                        arr[9 - 1][i] = true;
                        break;

                    case 'e':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        arr[8 - 1][i] = true;
                        break;

                    case 'f':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        break;

                    case 'g':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;

                        break;

                    case 'a':
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        break;


                    case 'b':
                        arr[2 - 1][i] = true;
                        break;

                    case 'C':
                        arr[3 - 1][i] = true;
                        break;

                    case 'D':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        arr[8 - 1][i] = true;
                        arr[9 - 1][i] = true;
                        break;

                    case 'E':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        arr[8 - 1][i] = true;
                        break;
                    case 'F':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        arr[7 - 1][i] = true;
                        break;
                    case 'G':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        arr[4 - 1][i] = true;
                        break;
                    case 'A':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        arr[3 - 1][i] = true;
                        break;

                    case 'B':
                        arr[1 - 1][i] = true;
                        arr[2 - 1][i] = true;
                        break;

                }

            }
            System.out.println(Arrays.deepToString(arr));
            for (boolean[] array : arr) {
                System.out.print(countconti(array) + " ");
            }
            System.out.println();
        }
    }

    public static int countconti(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i - 1 >= 0 && arr[i] && !arr[i - 1]) {
                count++;
            }
        }
        if (arr[0]) {
            count++;
        }
        return count;
    }
}
