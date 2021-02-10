import java.util.Scanner;

public class twoTheNines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String original=scanner.nextLine();
            String storeoriginal=original;
            if (original.equals("9")) {
                System.out.println("9 is a multiple of 9 and has a 9-degree of "+9+".");
            }

            if (!isninemultiple(original)) {
                System.out.println(original + " is not a multiple of 9.");
                continue;
            }
            int count=0;
            while (isninemultiple(original) && !original.equals("9")) {
                count++;
                original = sumdigits(original);
            }
            System.out.println(storeoriginal+" is a multiple of 9 and has a 9-degree of "+count+".");

        }


    }

    public static boolean isninemultiple(String string) {
        int sumdigits = 0;
        for (int i = 0; i < string.length(); i++) {
            sumdigits += (string.charAt(i) - '0');
        }
        if (sumdigits % 9 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String sumdigits(String string) {
        int sumdigits = 0;
        for (int i = 0; i < string.length(); i++) {
            sumdigits += (string.charAt(i) - '0');
        }
        return Integer.toString(sumdigits);

    }
}
