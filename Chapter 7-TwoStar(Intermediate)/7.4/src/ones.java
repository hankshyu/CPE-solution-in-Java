import java.util.Scanner;

public class ones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int testcase=scanner.nextInt();
            int remainder=1;
            int layers=1;
            while (remainder % testcase != 0) {
                remainder=(remainder*10+1)%testcase;
                layers++;

            }
            System.out.println(layers);
        }
    }
}
