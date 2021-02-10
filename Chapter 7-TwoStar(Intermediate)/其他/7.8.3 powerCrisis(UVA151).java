import java.util.ArrayList;
import java.util.Scanner;

public class powerCrisis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        powerCrisis powerCrisis = new powerCrisis();

        while (scanner.hasNext()) {
            int total=scanner.nextInt();
            if (total == 0) {
                break;
            }
            for (int i = 1; ; i++) {
                if (powerCrisis.imitation(total, i) == 13) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public int imitation(int total, int m) {
        ArrayList<node> nodes = new ArrayList<>();
        for (int i = 1; i <= total; i++) {
            node newnode = new node(i);
            nodes.add(newnode);
        }
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).connect(nodes.get(i + 1));
        }
        nodes.get(nodes.size() - 1).connect(nodes.get(0));
        node index = nodes.get(0);
        index.last.connect(index.next);
        index = index.next;
        while (index.next != index) {
            for (int i = 0; i < m - 1; i++) {
                index = index.next;
            }
            index.last.connect(index.next);
            index = index.next;
        }
        return index.number;


    }

    class node {
        int number;
        node next;
        node last;

        public node(int num) {
            this.number = num;
        }

        public void connect(node nextnode) {
            this.next = nextnode;
            nextnode.last = this;
        }

    }
}
