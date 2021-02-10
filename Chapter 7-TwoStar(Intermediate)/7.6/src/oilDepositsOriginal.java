import java.util.Scanner;

public class oilDepositsOriginal {
    static char[][] arr;
    static boolean[][] check;
    static int x;
    static int y;

    public void dfs(int i, int j) {

        if (i < 0 || j < 0 || i >= x || j >= y) {
            return;
        } else if (arr[i][j] == '*' || check[i][j]) {
            return;
        } else {
            check[i][j] = true;
            dfs(i - 1, j - 1);
            dfs(i, j - 1);
            dfs(i + 1, j - 1);
            dfs(i - 1, j);
            dfs(i, j);
            dfs(i + 1, j);
            dfs(i - 1, j + 1);
            dfs(i, j + 1);
            dfs(i + 1, j + 1);

        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        oilDepositsOriginal top = new oilDepositsOriginal();

        while (sc.hasNext()) {
            String[] iparr = sc.nextLine().split("\\s+");
            x = Integer.parseInt(iparr[0]);
            y = Integer.parseInt(iparr[1]);
            if (x == 0 || y == 0) {
                break;
            }
            arr = new char[x][y];
            check = new boolean[x][y];

            for (int i = 0; i < x; i++) {
                String ip = sc.nextLine();
                for (int j = 0; j < y; j++) {
                    arr[i][j] = ip.charAt(j);
                }

            }

            for (boolean[] row : check) {
                for (boolean b : row) {
                    b = false;
                }

            }
            int count=0;
            for(int i=0;i<x;i++) {
                for(int j=0;j<y;j++) {
                    if(arr[i][j]=='@'&& !check[i][j]) {
                        count++;
                        top.dfs(i,j);

                    }


                }
            }
            System.out.println(count);

        }

    }

}
