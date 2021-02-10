import java.util.Scanner;

public class symmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int casecount=0;

        while ((casecount++)!=cases) {
            String[] split = scanner.nextLine().split("\\s+");
            int matrixsize = Integer.parseInt(split[2]);
            int[][] matrix = new int[matrixsize][matrixsize];
            for (int i = 0; i < matrixsize; i++) {
                String[] split1 = scanner.nextLine().split("\\s+");
                for (int j = 0; j < matrixsize; j++) {
                    matrix[i][j] = Integer.parseInt(split1[j]);
                }
            }
            boolean flag=true;
            for (int i = 0; i < matrixsize; i++) {
                for (int j = 0; j < matrixsize; j++) {
                    if (matrix[i][j] != matrix[matrixsize - i - 1][matrixsize - j - 1]) {
                        flag=false;
                    }
                }
            }
            System.out.print("Test #"+casecount+": ");
            if (flag) {
                System.out.println("Symmetric.");
            } else {
                System.out.println("Non-symmetric.");
            }

        }

    }
}
