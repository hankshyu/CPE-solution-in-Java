import java.util.Scanner;

public class SummingDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            long number=scanner.nextLong();
            if (number == 0) {
                break;
            }
            System.out.println(sumdigit(number));


        }

    }

    public static long sumdigit(long num) {

        if (num >= 0 && num < 10) {
            return num;
        } else {
            int newsum = 0;

            for (int i = 0; i < Long.toString(num).length(); i++) {
                newsum += Long.toString(num).charAt(i) - '0';

            }
            return sumdigit(newsum);
        }
    }
}
