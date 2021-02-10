import java.util.Scanner;

public class aDoomsDayAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int[] Months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        while (cases-- > 0) {
            String[] split = scanner.nextLine().split("\\s+");
            int month = Integer.parseInt(split[0]);
            int day = Integer.parseInt(split[1]);
            if (month >= 2) {
                for (int i = 0; i <= month - 2; i++) {
                    day += Months[i];
                }
            }
            System.out.println(weeks[(day+4)%7]);


        }
    }
}
