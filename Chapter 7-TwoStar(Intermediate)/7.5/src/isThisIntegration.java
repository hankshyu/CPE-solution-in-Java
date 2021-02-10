import java.util.Scanner;

public class isThisIntegration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            double r = scanner.nextDouble();

            double f1 = r * r;
            double f2 = Math.PI * r * r / 4;
            double f3 = (Math.PI * r * r / 3) - (Math.sqrt(3) * r * r / 4);

            double twozplusy = f1 - f2;
            double zplusy = f2 - f3;

            double z = twozplusy- zplusy;
            double y = zplusy - z;
            double x = f3 - z - 2 * y;

            System.out.printf("%.3f %.3f %.3f\n", x, 4 * y, 4*z);
        }
    }
}
