
import java.util.Scanner;
import java.util.Stack;

public class fourNineEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = Integer.parseInt(scanner.nextLine());
            String[] split = scanner.nextLine().split("\\s+");
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < split.length; i++) {
                stack.push(Integer.parseInt(split[i]));
            }
            int[] precoefficient = new int[split.length];
            for (int i = 0; i < precoefficient.length; i++) {
                precoefficient[i] = stack.pop();
            }
            int[] coefficient = new int[split.length - 1];
            for (int i = 0; i < coefficient.length; i++) {
                coefficient[i]=precoefficient[i+1]*(i+1);
            }
            long ans=0;
            for (int i = 0; i < coefficient.length; i++) {
                ans += coefficient[i] * Math.pow(x, i);
            }
            System.out.println(ans);
        }

    }
}
