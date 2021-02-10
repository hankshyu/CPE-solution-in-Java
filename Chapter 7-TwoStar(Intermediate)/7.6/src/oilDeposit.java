import java.util.Arrays;
import java.util.Scanner;

public class oilDeposit {
    static boolean[][] checked;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String[] sizedescription = scanner.nextLine().split("\\s+");
            int rows = Integer.parseInt(sizedescription[0]);
            int columns = Integer.parseInt(sizedescription[1]);
            if (rows == 0 && columns == 0) {
                break;
            }
            char[][] map = new char[rows][columns];
            checked = new boolean[rows][columns];

            //fill up the map
            for (int i = 0; i < rows; i++) {
                String mapinfo = scanner.nextLine();
                for (int j = 0; j < columns; j++) {
                    map[i][j] = mapinfo.charAt(j);
                }

            }
            int pockets = 0;
            //dfs
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (!checked[i][j] && map[i][j] == '@') {
                        pockets++;
                        dfs(i, j, map);
                    }
                }
            }
            System.out.println(pockets);


        }
    }


    public static void dfs(int x, int y, char[][] map) {
        if (x >= 0 && y >= 0 && x < map.length && y < map[0].length&&!checked[x][y]) {
            checked[x][y] = true;

        } else {
            return;
        }

        if (map[x][y] == '*') {
            return;
        } else {
            dfs(x - 1, y - 1, map);
            dfs(x - 1, y, map);
            dfs(x - 1, y + 1, map);
            dfs(x, y - 1, map);
            dfs(x, y + 1, map);
            dfs(x + 1, y - 1, map);
            dfs(x + 1, y, map);
            dfs(x + 1, y + 1, map);

        }

    }
}
