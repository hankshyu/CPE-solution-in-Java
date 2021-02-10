import java.util.Scanner;

public class powerString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input=scanner.nextLine();
            if (input.equals(".")) {
                break;
            }
            boolean hasanswer=false;
            for (int i = 1; i < input.length(); i++) {
                if (input.length()% i != 0) {
                    continue;
                }
                String subString = input.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < input.length() / i; j++) {
                    stringBuilder.append(subString);
                }
                String tocompare=stringBuilder.toString();
                if (tocompare.equals(input)) {
                    hasanswer=true;
                    System.out.println(input.length() / i);
                }

            }
            if (!hasanswer) {
                System.out.println(1);
            }
        }
    }
}
