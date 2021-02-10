import java.util.Arrays;
import java.util.Scanner;

public class largestSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcases = Integer.parseInt(scanner.nextLine());
        while (totalcases-- > 0) {
            String conditions = scanner.nextLine();
            String[] split = conditions.split("\\s+");
            System.out.println(conditions);
            int M = Integer.parseInt(split[0]);
            int N = Integer.parseInt(split[1]);
            int Q = Integer.parseInt(split[2]);

            char[][] matrix = new char[M][N];
            for (int i = 0; i < M; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = line.charAt(j);
                }
            }

            while (Q-- > 0) {
                String[] splitline = scanner.nextLine().split("\\s+");
                int x = Integer.parseInt(splitline[0]);
                int y = Integer.parseInt(splitline[1]);
                int layers=0;
                boolean flag=true;
                char standard = matrix[x][y];
                while (flag) {
                    for (int i = x - layers; i <= x + layers; i++) {
                        for (int j = y - layers; j <= y + layers; j++) {
                            if (i < 0 || j< 0 || i >= M || j >= N) {
                                flag=false;
                                break;
                            }
                            if (matrix[i][j] != standard) {
                                flag=false;
                                break;
                            }
                        }
                    }
                    layers++;
                }
                System.out.println((layers-2)*2+1);
            }

        }
    }
}
