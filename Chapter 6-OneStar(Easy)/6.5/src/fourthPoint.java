import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fourthPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            ArrayList<Point2D.Double> list = new ArrayList<>();
            Set<Point2D> set = new HashSet<>();
            list.add(new Point2D.Double(scanner.nextDouble(), scanner.nextDouble()));
            list.add(new Point2D.Double(scanner.nextDouble(), scanner.nextDouble()));
            list.add(new Point2D.Double(scanner.nextDouble(), scanner.nextDouble()));
            list.add(new Point2D.Double(scanner.nextDouble(), scanner.nextDouble()));
            Point2D duplicate = null;
            for (Point2D p : list) {
                if (set.contains(p)) {
                    duplicate = p;
                } else {
                    set.add(p);
                }
            }
            Double finalx = 0.0;
            Double finaly = 0.0;
            for (Point2D p : list) {
                if (!p.equals(duplicate)) {
                    finalx+=p.getX();
                    finaly+=p.getY();
                }
            }
            System.out.printf("%.3f %.3f",finalx-duplicate.getX(),finaly-duplicate.getY());
            System.out.println();

        }
    }
}
