import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class birthdayCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcherry = 2 * Integer.parseInt(scanner.nextLine());

        ArrayList<Point> cherries = new ArrayList<>();
        while (totalcherry-- > 0) {
            cherries.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }
        scanner.next();

        for (int i = -500; i <= 500; i++) {
            boolean resultbool = false;
            for (int j = -500; j <= 500; j++) {

                int up = 0;
                int down = 0;
                boolean slicewarning = false;
                for (Point p : cherries) {
                    int resulut = judgecherry(p.getX(), p.getY(), i, j);
                    if (resulut == 1) {
                        up++;
                    } else if (resulut == -1) {
                        down++;
                    } else {
                        slicewarning = true;
                        break;
                    }
                }
                if (slicewarning) {
                    continue;
                }
                if (up == down) {
                    System.out.println(i + " " + j);
                    resultbool = true;
                    break;
                }

            }
            if (resultbool) {
                break;
            }
        }

    }

    public static int judgecherry(double x, double y, int a, int b) {
        if (a * x + b * y == 0) {
            return 0;
        } else if (a * x + b * y > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
