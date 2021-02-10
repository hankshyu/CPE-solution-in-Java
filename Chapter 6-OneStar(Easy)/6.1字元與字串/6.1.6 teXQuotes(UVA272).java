import java.util.Scanner;

public class twXQuotes {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String st = scanner.nextLine();
            for (int i = 0; i < st.length(); i++) {

                char ch = st.charAt(i);
                if (ch != '"') {
                    System.out.print(ch);

                } else {
                    if ((++counter) % 2 == 1) {
                        System.out.print("``");
                    } else {
                        System.out.print("''");

                    }
                }
            }
            System.out.println();
        }
    }
}
