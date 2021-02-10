import java.util.Scanner;

public class trainSwapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcase = Integer.parseInt(scanner.nextLine());
        while (totalcase-- > 0) {
            int num=Integer.parseInt(scanner.nextLine());
            int[] arr = new int[num];
            String[] split = scanner.nextLine().split("\\s+");
            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            int count=0;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        count++;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.println("Optimal train swapping takes "+count+" swaps.");
        }
    }
}
