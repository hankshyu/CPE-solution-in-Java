import java.util.ArrayList;
import java.util.Scanner;

public class productofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        productofdigits top = new productofdigits();
        int totalcase = Integer.parseInt(scanner.nextLine());
        while (totalcase-- > 0) {
            long input = Long.parseLong(scanner.nextLine());
            if (input == 0) {
                System.out.println("10");
                continue;
            }
            if (input == 1) {
                System.out.println("1");
                continue;
            }
            ArrayList<Integer> arrayList = top.decompose(input);
            if (!top.validdecompose(arrayList)) {
                System.out.println(-1);
                continue;
            }
            for (Integer i : arrayList) {
                System.out.print(i);
            }
            System.out.println();
        }


    }

    public ArrayList<Integer> decompose(long a) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int divider = 2;
        while (a != 1) {
            if (a % divider == 0) {
                arrayList.add(divider);
                a /= divider;
            } else {
                divider++;
            }
        }
        return arrayList;
    }

    public boolean validdecompose(ArrayList<Integer> arrayList) {
        for (Integer i : arrayList) {
            if (i > 9) {
                return false;
            }
        }
        return true;
    }
}
