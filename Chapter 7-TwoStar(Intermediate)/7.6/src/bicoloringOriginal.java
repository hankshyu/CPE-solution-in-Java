import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class bicoloringOriginal {
    public enum Colors {
        black, white, none;
    }

    static vertex[] arr = new vertex[202];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int v = sc.nextInt();
            if (v == 0) {
                break;
            }
            int e = sc.nextInt();
            for (int i = 0; i < v; i++) {
                arr[i] = new vertex();
            }
            for (int i = 0; i < e; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a].kids.add(b);
                arr[b].kids.add(a);

            }
            System.out.println(DFS(0) ? "BICOLORABLE" : "NOT bICOLOURABLE");

        }
        sc.close();
    }

    public static boolean DFS(int root) {

        Stack<Integer> st = new Stack<Integer>();
        st.push(root);
        vertex current = arr[root];
        current.color = Colors.black;
        while (!st.isEmpty()) {
            current = arr[st.pop()];
            for (Integer child : current.kids) {
                if (arr[child].color == current.color) {
                    return false;
                }
                if (arr[child].color == Colors.none) {
                    arr[child].color = current.color == Colors.black ? Colors.white : Colors.black;
                    st.push(child);

                }

            }

        }

        return true;
    }

    private static class vertex {
        Colors color = Colors.none;
        LinkedList<Integer> kids = new LinkedList<>();
    }

}