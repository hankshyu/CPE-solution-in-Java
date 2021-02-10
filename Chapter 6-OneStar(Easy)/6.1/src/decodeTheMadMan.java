import java.util.Scanner;

public class decodeTheMadMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        String string = scanner.nextLine().toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') {
                stringBuilder.append(c);
            } else {
                stringBuilder.append(st.charAt(st.indexOf(c) - 2));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
