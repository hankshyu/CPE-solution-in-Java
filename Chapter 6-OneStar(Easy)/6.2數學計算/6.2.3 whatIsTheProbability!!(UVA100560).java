import java.util.Scanner;

public class whatIsTheProbability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        while (cases-- > 0) {
            String[] split = scanner.nextLine().split("\\s+");
            int totalplayer = Integer.parseInt(split[0]);
            double p = Double.parseDouble(split[1]);
            double q = 1 - p;
            int stplayer = Integer.parseInt(split[2]);
            double series = 1/ (1 - Math.pow(q, totalplayer));
            double stadjust = p * Math.pow(q, stplayer - 1);
            System.out.printf("%.4f\n",series*stadjust);


        }
    }
}
