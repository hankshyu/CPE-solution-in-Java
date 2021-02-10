import java.util.*;

public class cheapestBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalcase = Integer.parseInt(scanner.nextLine());
        int casecount = 0;

        while (casecount++ < totalcase) {
            System.out.println("Case "+casecount+":");
            //map are used to store the ink value
            Map<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i <36; i++) {
                map.put(baseconvert(i), scanner.nextInt());
            }
            int testcases=scanner.nextInt();
            //each test case starts here
            while (testcases-- > 0) {
                int testcase=scanner.nextInt();
                //basecost are use to count the cost of applying each base
                int []basecost=new int [36];
                //base 0 and 1 are abandoned
                basecost[0]=Integer.MAX_VALUE;
                basecost[1]=Integer.MAX_VALUE;

                //fill the basecost with each radix
                for (int i = 2; i < basecost.length; i++) {
                    String convertradix = convertradix(testcase, i);
                    basecost[i] = priceofstring(convertradix, map);
                }

                System.out.print("Cheapest base(s) for number "+testcase+": ");
                int []copycost=basecost.clone();
                Arrays.sort(copycost);
                int smallestprice = copycost[0];
                for (int i = 2; i < basecost.length; i++) {
                    if (basecost[i] == smallestprice) {
                        System.out.print(i+" ");
                    }
                }
                System.out.println();

            }

        }
    }

    public static int priceofstring(String string, Map<Character, Integer> map) {
        int price=0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            price += map.get(ch);
        }
        return price;
    }

    public static char baseconvert(int x) {
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return str.charAt(x);
    }

    public static String convertradix(int original, int base) {
        StringBuilder stringBuilder = new StringBuilder();
        while (original != 0) {
            int remainder = original % base;
            stringBuilder.insert(0, baseconvert(remainder));
            original = original / base;
        }

        return stringBuilder.toString();
    }
}
