import java.util.Scanner;

public class whatsCryptanalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int[] ints = new int[300];
        int maxlength=0;
        while (cases-- > 0) {
            String s = scanner.nextLine().toUpperCase();
            if (s.length() > maxlength) {
                maxlength=s.length();
            }
            for (int i = 0; i < s.length(); i++) {
                ints[s.charAt(i)]++;
            }

        }
        for (int i =maxlength; i > 0; i--) {
            for (int j = 'A'; j <= 'Z'; j++) {
                if (ints[j] == i) {
                    System.out.println((char)j+" "+ints[j]);
                }
            }
        }
    }
}
