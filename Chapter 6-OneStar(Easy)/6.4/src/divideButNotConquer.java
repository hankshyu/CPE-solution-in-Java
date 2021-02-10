import java.util.Scanner;

public class divideButNotConquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int big= scanner.nextInt();
            int small = scanner.nextInt();
            boolean flag=true;
            String outputString = big+"";
            while (big != 1) {
                if (big % small == 0) {
                    big /= small;
                    outputString=outputString+" "+big;
                } else {
                    flag=false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Boring !");
            } else {
                System.out.println(outputString);
            }

        }
    }
}
