import java.util.ArrayList;
import java.util.Scanner;

public class simpleAddtion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int low = scanner.nextInt();
            int up = scanner.nextInt();
            if (low == -1 && up == -1) {
                break;
            }
            ArrayList<Long> tenlist = new ArrayList<>();
            ArrayList<Long> normallist = new ArrayList<>();

            for (long l = low; l <= up; l++) {
                if (l % 10 == 0) {
                    tenlist.add(l);
                } else {
                    normallist.add(l);
                }
            }

            long ans = 0;
            while (!tenlist.isEmpty() || !normallist.isEmpty()) {

                if (!tenlist.isEmpty()) {
                    ArrayList<Long> newtenlist = new ArrayList<>();
                    for (Long L : tenlist) {
                        Long newl = L / 10;
                        //tenlist.remove(L);
                        if (newl % 10 == 0) {
                            newtenlist.add(newl);
                        } else {
                            normallist.add(newl);
                        }
                    }
                    tenlist=newtenlist;
                }
                if (!normallist.isEmpty()) {
                    for (Long L : normallist) {

                        ans += F(L);
                    }
                    normallist.clear();
                }


            }
            System.out.println(ans);
        }
    }

    public static int F(long value) {
        if (value == 0) {
            return 0;
        } else {
            return (int) value % 10;
        }
    }
}
