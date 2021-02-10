import java.util.ArrayList;
import java.util.Scanner;

public class deadFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputoriginal=scanner.nextLine();
            if (inputoriginal.equals("0")) {
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 2; i < inputoriginal.length(); i++) {
                char ch = inputoriginal.charAt(i);
                if (ch>= '0' && ch <= '9') {
                    stringBuilder.append(ch);
                }
            }
            ArrayList<fraction> fractions = new ArrayList<>();
            String source=stringBuilder.toString();

            for (int i = 1; i <= source.length(); i++) {

                String downstr = "";
                for (int j = 0; j < i; j++) {
                    downstr += "9";
                }
                for (int j = 0; j < source.length() - i; j++) {
                    downstr = downstr + "0";
                }
                int down = Integer.parseInt(downstr);

                String upsubstring=source.substring(0,source.length()-i);

                int up =0;
                if (!upsubstring.isEmpty()) {
                    up=Integer.parseInt(source) - Integer.parseInt(upsubstring);
                } else {
                    up=Integer.parseInt(source);
                }
                fraction f = new fraction(up, down);
                f.adjust();
                fractions.add(f);

            }
            int smallestdown = Integer.MAX_VALUE;
            fraction targetfracion=null;
            for (fraction f : fractions) {
                if (f.down < smallestdown) {
                   smallestdown=f.down;
                    targetfracion=f;
                }
            }
            System.out.println(targetfracion.up+"/"+targetfracion.down);
        }
    }
}

class fraction {
    int up;
    int down;

    public fraction(int up, int down) {
        this.up = up;
        this.down = down;
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }

    public void adjust() {
        int storeup = up;
        int storedown = down;
        int gcd = gcd(up, down);
        up = storeup / gcd;
        down = storedown / gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}