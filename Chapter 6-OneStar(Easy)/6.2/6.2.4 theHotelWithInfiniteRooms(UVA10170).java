import java.util.Scanner;

public class theHotelWithInfiniteRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            long firstday = Long.parseLong(scanner.next());
            long target = Long.parseLong(scanner.next());
            for (long i = firstday, day=0;; i++) {
                day+=i;
                if (day >= target) {
                    System.out.println(i);
                    break;
                }


            }
        }
    }
}
