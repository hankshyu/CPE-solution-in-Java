import java.util.Scanner;

public class funnyEncryptionMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        while (cases-->0) {
            int num=scanner.nextInt();
            String originalstring=Integer.toString(num);
            String stringb1 = Integer.toBinaryString(num);
            int b1 = numofone(stringb1);
            int b2 = 0;
            for (int i = 0; i < originalstring.length(); i++) {
                String toprocess=Integer.toBinaryString(originalstring.charAt(i)-'0');
                b2 += numofone(toprocess);
            }
            System.out.println(b1 + " " + b2);

        }
    }

    public static int  numofone(String string) {
        int ans=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }
}
