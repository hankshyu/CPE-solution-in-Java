import java.util.Scanner;

public class satellites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split("\\s+");
            int r=Integer.parseInt(split[0])+6440;
            double angle = Double.parseDouble(split[1]);
            String angeldescription = split[2];
            if (angeldescription.equals("min")) {
                angle/=60;
            }
            System.out.printf("%.6f",Math.PI * 2 * r * angle / 360);
            System.out.print(" ");
            System.out.printf("%.6f",r*Math.sin(angle*2*Math.PI/720)*2);
        }
    }
}
