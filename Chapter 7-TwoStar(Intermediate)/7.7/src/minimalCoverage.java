import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class minimalCoverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalcases = Integer.parseInt(scanner.nextLine());
        while (totalcases-- > 0) {
            scanner.nextLine();
            int MostRight = Integer.parseInt(scanner.nextLine());
            LinkedList<string> allstrings = new LinkedList<>();
            ArrayList<string> usedstrings = new ArrayList<>();

            //input all strings
            while (true) {
                String[] stringinfo = scanner.nextLine().split("\\s+");

                int stringleft = Integer.parseInt(stringinfo[0]);
                int stringright = Integer.parseInt(stringinfo[1]);
                if (stringleft == 0 && stringright == 0) {
                    break;
                }
                string newstring = new string(stringleft, stringright);
                allstrings.add(newstring);
            }
            int currentright = 0;
            boolean failflag = false;
            while (currentright < MostRight) {
                //iterate all to find candidate
                string candidate = null;
                int idealright = Integer.MIN_VALUE;
                for (string st : allstrings) {
                    if (st.right > idealright && st.left <= currentright && st.right > currentright) {
                        //update
                        idealright = st.right;
                        candidate = st;
                    }
                }
                if (candidate == null) {
                    failflag = true;
                    break;
                }
                usedstrings.add(candidate);
                allstrings.remove(candidate);
                currentright = candidate.right;

            }
            if (failflag) {
                System.out.println("0");
            } else {
                System.out.println(usedstrings.size());
                for (string st : usedstrings) {
                    System.out.println(st.left + " " + st.right);
                }
            }
            System.out.println();

        }
    }

    static class string {
        int left;
        int right;

        public string(int givenleft, int givenright) {
            this.left = givenleft;
            this.right = givenright;
        }
    }
}
