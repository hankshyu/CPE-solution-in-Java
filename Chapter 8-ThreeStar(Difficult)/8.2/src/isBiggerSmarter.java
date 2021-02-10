import java.util.*;

public class isBiggerSmarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<elephant> all = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] eleinfo = scanner.nextLine().split("\\s+");
            elephant newelephant = new elephant(all.size() + 1, Integer.parseInt(eleinfo[0]), Integer.parseInt(eleinfo[1]));
            all.add(newelephant);
//        all.add(new elephant(1, 6008, 1300));
//        all.add(new elephant(2, 6000, 2100));
//        all.add(new elephant(3, 500, 2000));
//        all.add(new elephant(4, 1000, 4000));
//        all.add(new elephant(5, 1100, 3000));
//        all.add(new elephant(6, 6000, 2000));
//        all.add(new elephant(7, 8000, 1400));
//        all.add(new elephant(8, 6000, 1200));
//        all.add(new elephant(9, 2000, 1900));

            Collections.sort(all);
            for (elephant e : all) {
                System.out.println(e);
            }


            int[] len = new int[all.size()];
            int[] predecessor = new int[all.size()];

            Arrays.fill(len, 1);
            Arrays.fill(predecessor, -1);


            for (int i = 1; i < len.length; i++) {
                elephant currentcompare = all.get(i);
                for (int j = 0; j < i; j++) {
                    elephant candidate = all.get(j);
                    if (candidate.weight < currentcompare.weight && len[j] + 1 > len[i]) {
                        //update
                        len[i] = len[j] + 1;
                        predecessor[i] = j;
                    }
                }
            }
            System.out.println(Arrays.toString(len));

            int longestlen = -1;
            int longestindex = -1;
            for (int i = 0; i < len.length; i++) {
                if (len[i] > longestlen) {
                    longestlen = len[i];
                    longestindex = i;
                }
            }
            System.out.println("longestlen = " + longestlen);
            Stack<Integer> stack = new Stack<>();
            while (predecessor[longestindex] != -1) {
                stack.push(all.get(longestindex).number);
                longestindex = predecessor[longestindex];
            }
            stack.push(all.get(longestindex).number);
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

        }


    }

    static class elephant implements Comparable<elephant> {

        int number;
        int weight;
        int iq;

        public elephant(int number, int weight, int iq) {
            this.number = number;
            this.weight = weight;
            this.iq = iq;
        }

        @Override
        public String toString() {
            return "elephant{" +
                    "number=" + number +
                    ", weight=" + weight +
                    ", iq=" + iq +
                    '}';
        }

        @Override
        public int compareTo(elephant o) {
            return o.iq - this.iq;
        }
    }
}
