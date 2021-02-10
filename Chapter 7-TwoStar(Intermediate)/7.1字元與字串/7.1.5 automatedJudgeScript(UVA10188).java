import java.util.ArrayList;
import java.util.Scanner;

public class automatedJudgeScript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casecount=0;
        while (true) {
            int lines = Integer.parseInt(scanner.nextLine());
            int storelines=lines;
            if (lines == 0) {
                break;
            }
            casecount++;
            ArrayList<String> standard = new ArrayList<>();
            ArrayList<String> ask = new ArrayList<>();
            while (lines-- > 0) {
                standard.add(scanner.nextLine());

            }
            String waste=scanner.nextLine();
            while (storelines-- > 0) {
                ask.add(scanner.nextLine());

            }
            System.out.println(standard);
            System.out.println(ask);
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < standard.size(); i++) {
                ans.append(judge(standard.get(i), ask.get(i)));
            }
            String s = ans.toString();
            System.out.print("Run #"+casecount+": ");
            switch (judgefinalanswer(s)) {
                case 1:
                    System.out.println("Accepted");
                    break;
                case 2:
                    System.out.println("Presentation Error");
                    break;
                case 3:
                    System.out.println("Wrong Answer");
                    break;
            }

        }

    }

    public static boolean  accept(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String  extractnum(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch=string.charAt(i);
            if (ch >= '0' && string.charAt(i) <= '9') {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean presentationerror(String str1, String str2) {
        String s1 = extractnum(str1);
        String s2 = extractnum(str2);
        return s1.equals(s2);
    }

    public static int judge(String str1, String str2) {
        if (accept(str1, str2)) {
            return 1;
        }
        if (presentationerror(str1, str2)) {
            return 2;
        }
        return 3;
    }

    public static int judgefinalanswer(String string) {
        boolean flag1=true;
        boolean flag2=true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '1') {
                flag1=false;
            }
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '3') {
                flag2=false;
            }
        }
        if (flag1) {
            return 1;
        } else if (!flag2) {
            return 3;
        } else {
            return 2;
        }
    }
}
