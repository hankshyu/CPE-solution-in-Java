import java.util.Scanner;

public class safesalutaion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[11];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            int value=0;
            for (int j = 0; j < i; j++) {
                value += arr[j] * arr[i - 1 - j];
            }
            arr[i]=value;
        }

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(arr[input]);
        }
    }
}
