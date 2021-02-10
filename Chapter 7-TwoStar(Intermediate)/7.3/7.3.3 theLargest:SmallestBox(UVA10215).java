import java.util.Scanner;

public class theLargestSmallestBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            double L = scanner.nextDouble();
            double W = scanner.nextDouble();
            double delta = Math.sqrt(L * L + W * W - L * W);
            double max = (L + W - delta) / 6;
            double min = (L + W + delta )/ 6;
            System.out.printf("%.3f %.3f %.3f\n",max,0.000,min);
        }


    }
}
