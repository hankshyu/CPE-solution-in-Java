import java.util.ArrayList;
import java.util.Scanner;

public class theTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int nums = Integer.parseInt(scanner.nextLine());
            if (nums == 0) {
                break;
            }
            ArrayList<Double> arrayList = new ArrayList<>();
            while (nums --> 0) {
                arrayList.add(Double.parseDouble(scanner.nextLine()));
            }
            double sum=0;
            for (Double d:arrayList ) {
                sum+=d;
            }
            double average=sum/arrayList.size();
            double dic1=0;
            double dic2=0;
            for (Double d : arrayList) {
                if (d > average) {
                    double margin=d-average;
                    dic1+=(int)(margin/0.01)*0.01;
                } else if (d < average) {
                    double margin=average-d;
                    dic2+=(int)(margin/0.01)*0.01;
                }
            }

            System.out.printf("$%.2f\n",Math.max(dic1,dic2));

        }

    }
}
