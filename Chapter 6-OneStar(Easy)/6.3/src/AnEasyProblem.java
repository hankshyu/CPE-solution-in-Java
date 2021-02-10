import java.util.Scanner;

public class AnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            boolean flag=false;
            String string = scanner.nextLine();
            int smallestbase=0;
            for (int i = 0; i < string.length(); i++) {
                int chartransfer = chartransfer(string.charAt(i));
                if (chartransfer > smallestbase) {
                    smallestbase=chartransfer;
                }
            }
            smallestbase++;
            string = reverseString(string);
            for (int i = smallestbase; i < chartransfer('z'); i++) {
                long value=0;
                for (int j = 0; j < string.length(); j++) {
                    value +=chartransfer(string.charAt(j))* Math.pow(i, j);
                }
                if (value % (i - 1) == 0) {
                    flag=true;
                    System.out.println(i);
                    break;
                }

            }
            if (!flag) {
                System.out.println("such number is impossible!");
            }
        }

    }

    public static int chartransfer(char ch) {
        String st = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return st.indexOf(ch);

    }

    public static String reverseString(String string) {
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            ans=string.charAt(i)+ans;
        }
        return ans;
    }
}
