import java.util.ArrayList;
import java.util.Scanner;

public class hartles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totoalcase = Integer.parseInt(scanner.nextLine());
        while (totoalcase-- > 0) {
            int days = Integer.parseInt(scanner.nextLine());
            int party = Integer.parseInt(scanner.nextLine());
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < party; i++) {
                arrayList.add(Integer.parseInt(scanner.nextLine()));
            }
            int[] calander = new int[days];
            for (int i = 0; i < calander.length; i++) {
                calander[i]=0;
            }
            for (int i : arrayList) {
                for (int j = 0; j < calander.length; j++) {
                    if ((j + 1) % i == 0) {
                        calander[j]=1;
                    }
                }
            }
            for (int i = 0; i < calander.length; i++) {
                if (i % 7 == 5 || i % 7 == 6) {
                    calander[i]=0;
                }
            }
            int counter=0;
            for (int i: calander) {
                if (i == 1) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
