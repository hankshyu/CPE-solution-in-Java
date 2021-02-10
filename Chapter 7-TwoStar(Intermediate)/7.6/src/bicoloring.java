import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class bicoloring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numofvertex = scanner.nextInt();
            if (numofvertex == 0) {
                break;
            }
            int sides = scanner.nextInt();
            LinkedList<vertex> allvertex = new LinkedList<>();

            for (int i = 0; i < numofvertex; i++) {
                allvertex.add(new vertex());
            }
            for (int i = 0; i < sides; i++) {
                //link them
                int link1 = scanner.nextInt();
                int link2 = scanner.nextInt();

                vertex linkv1 = allvertex.get(link1);
                vertex linkv2 = allvertex.get(link2);

                linkv1.linked.add(linkv2);
                linkv2.linked.add(linkv1);

            }
            System.out.println(dfs(allvertex.get(0))?"Biclorable":"Not bicolorable");

        }
    }

    public static boolean dfs(vertex root) {
        Stack<vertex> working = new Stack<>();
        root.color = 1;
        working.push(root);
        while (!working.isEmpty()) {
            vertex operating = working.pop();
            for (vertex vertex : operating.linked) {
                if (vertex.color == operating.color) {
                    return false;
                } else if(vertex.color==0) {
                    vertex.color = operating.color == 1 ? 2 : 1;
                    working.push(vertex);
                }

            }

        }
        return true;
    }

    static class vertex {
        int color = 0;
        LinkedList<vertex> linked = new LinkedList<>();
    }
}
