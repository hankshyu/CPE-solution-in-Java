import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;

import java.util.Scanner;

public class Cola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int totaldrink = 0;
            int originalbottle = scanner.nextInt();
            totaldrink=originalbottle;
            while (originalbottle > 3) {
                totaldrink += (originalbottle / 3);
                originalbottle = originalbottle / 3 + (originalbottle % 3);

            }
            if (originalbottle == 2) {

                totaldrink += 1;
            }
            System.out.println(totaldrink);
        }
    }

}
