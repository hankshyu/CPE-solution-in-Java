import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class smithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(decompose(4937775));
        while (scanner.hasNextLine()) {
            int totalcases = Integer.parseInt(scanner.nextLine());
            while (totalcases-- > 0) {
                int input = scanner.nextInt();
                for (int i = input+1;  ; i++) {
//                    System.out.println("sumofnum(i) = " + sumofnum(i));
//                    System.out.println("decompose(i) = " + decompose(i));
//                    System.out.println("sumoflist(decompose(i)) = " + sumoflist(decompose(i)));
                    if (sumofnum(i) == sumoflist(decompose(i)) && decompose(i).size() != 1) {

                        System.out.println(i);

                        break;
                    }
                }
            }

        }


    }

    public static int sumoflist(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {

            sum += sumofnum(i);
        }
        return sum;
    }

    public static ArrayList<Integer> decompose(int a) {
        ArrayList<Integer> arrayList = new ArrayList<>();
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

    public static int sumofnum(int num) {
        String string = Integer.toString(num);
        int ans = 0;
        for (int i = 0; i < string.length(); i++) {
            ans += string.charAt(i) - '0';
        }
        return ans;
    }
}
