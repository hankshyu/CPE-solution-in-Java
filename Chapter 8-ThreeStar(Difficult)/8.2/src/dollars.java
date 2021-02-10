import java.util.Arrays;
import java.util.Scanner;

public class dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double money = scanner.nextDouble();
            if (money == 0) {
                break;
            }
            if (money == 0.05) {
                System.out.printf("0.05 %17d",1);
                continue;
            }
            long chart[][] = new long[13][(int) (money / 0.05) + 2];

            for (int i = 1; i < chart.length; i++) {
                chart[i][1]=1;
            }
            for (int i = 0; i < chart[0].length; i++) {
                chart[0][i]=i*5-5;
            }
            chart[0+1][0]=0;
            chart[1+1][0]=5;
            chart[2+1][0]=10;
            chart[3+1][0]=20;
            chart[4+1][0]=50;
            chart[5+1][0]=100;
            chart[6+1][0]=200;
            chart[7+1][0]=500;
            chart[8+1][0]=1000;
            chart[9+1][0]=2000;
            chart[10+1][0]=5000;
            chart[11+1][0]=10000;
            for (int i = 2; i < chart.length; i++) {
                for (int j = 2; j < chart[i].length; j++) {
                    if (chart[0][j] >= chart[i][0]) {

                        chart[i][j] = chart[i - 1][j]+chart[i][j-(int)chart[i][0]/5];
                    } else {
                        chart[i][j] = chart[i - 1][j];
                    }

                }
            }
            //printarray(chart);
            System.out.printf("%.2f %17d",money,chart[chart.length-1][chart[0].length-1]);
            System.out.println();

        }

    }

    public static void printarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%10d\t",array[i][j]);
            }
            System.out.println();
        }
    }
}
