import java.util.Scanner;

public class minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casecount = 0;
        while (true) {
            casecount++;
            String[] split = scanner.nextLine().split("\\s+");
            int X = Integer.parseInt(split[0]);
            int Y = Integer.parseInt(split[1]);
            if (X == 0 || Y == 0) {
                break;
            }

            char[][] chars = new char[X][Y];

            for (int i = 0; i < X; i++) {
                String s = scanner.nextLine();
                for (int j = 0; j < Y; j++) {
                    chars[i][j] = s.charAt(j);
                }
            }
            System.out.println("Field #" + casecount + ":");
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    if (chars[i][j] == '*') {
                        System.out.print('*');
                    } else {
                        System.out.print(scan(i, j, chars));
                    }
                }
                System.out.println();
            }


        }
    }

    public static int scan(int i, int j, char[][] chars) {
        int number = 0;
        for (int ii = i - 1; ii <= i + 1; ii++) {
            for (int jj = j - 1; jj <= j + 1; jj++) {
                if (ii >= 0 && jj >= 0 && ii < chars.length && jj < chars[0].length) {
                    if (chars[ii][jj] == '*') {
                        number++;
                    }
                }
            }
        }
        return number;
    }
}
