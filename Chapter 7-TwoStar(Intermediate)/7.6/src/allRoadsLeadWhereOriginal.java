import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class allRoadsLeadWhereOriginal {
    static HashMap<String, node> map = new HashMap<String, node>();

    public void createtree(String ip) {
        node n = new node();
        n.st = ip;
        n.child = new ArrayList<node>();

        map.put(ip, n);
    }

    public void addnode(String pa, String own) {
        node n = new node();
        n.st = own;
        n.parent = map.get(pa);
        n.parent.child.add(n);
        n.child = new ArrayList<node>();
        map.put(own, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        allRoadsLeadWhereOriginal top = new allRoadsLeadWhereOriginal();
        int cases = Integer.valueOf(sc.nextLine());
        while (cases-- > 0) {
            sc.nextLine();
            String string = sc.nextLine();
            int ipcases = string.charAt(0) - '0';
            int opcases = string.charAt(2) - '0';

            top.createtree("Rome");
            while (ipcases-- > 0) {
                String starr1[] = sc.nextLine().split("\\s+");
                top.addnode(starr1[0], starr1[1]);

            }
            while (opcases-- > 0) {
                String starr[] = sc.nextLine().split("\\s+");
                String from = starr[0];
                ArrayList<String> recordfrom = new ArrayList<String>();
                String to = starr[1];
                Stack<String> stack = new Stack<String>();

                node current = new node();
                current = map.get(from);
                recordfrom.add(current.st);
                while (!current.st.equals("Rome")) {

                    current = current.parent;
                    recordfrom.add(current.st);
                }

                current = map.get(to);
                stack.push(current.st);
                while (!current.st.equals("Rome")) {

                    current = current.parent;
                    stack.push(current.st);
                }
                String remember = "";
                while (true) {
                    if (recordfrom.contains(stack.peek())) {

                        remember = stack.pop();
                        recordfrom.remove(remember);

                    } else {
                        break;
                    }
                }
                recordfrom.add(remember);
                while (!stack.isEmpty()) {
                    recordfrom.add(stack.pop());

                }

                String finalstring = recordfrom.toString();
                for (int i = 0; i < finalstring.length(); i++) {
                    if ('A' <= finalstring.charAt(i) && finalstring.charAt(i) <= 'Z') {
                        System.out.print(finalstring.charAt(i));

                    }

                }
                System.out.println();
            }
//			node current = new node();
//			current = map.get("Athens");
//			System.out.println(current.st);
//			while (!current.st.equals("Rome")) {
//
//				current = current.parent;
//				System.out.println(current.st);
//			}

        }
        sc.close();
    }

    private static class node {
        String st;
        private node parent;
        private List<node> child;

    }
}
