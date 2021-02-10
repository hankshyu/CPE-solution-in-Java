import java.util.Scanner;

public class quirksomeSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int num=scanner.nextInt();
            for (int i = 0; i < Math.pow(10, num/2); i++) {
                int numnum=i*i;
                //System.out.println(numnum);
                int head = numnum % (int)Math.pow(10, num/2);
                int tail = numnum / (int)Math.pow(10, num/2);
//                System.out.println("head = " + head);
//                System.out.println("tail = " + tail);
                if (Math.pow(tail + head, 2) == numnum) {
                    System.out.printf("%0"+num+"d\n",numnum);
                }
            }
        }

    }
}
