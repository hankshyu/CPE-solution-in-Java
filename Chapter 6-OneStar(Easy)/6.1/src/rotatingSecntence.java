import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rotatingSecntence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int maxstringlength = 0;

        while (scanner.hasNextLine()) {

            String st = scanner.nextLine();
            arrayList.add(st);
            if (st.length() > maxstringlength) {
                maxstringlength = st.length();
            }
            char[][] chars = new char[arrayList.size()][maxstringlength];
            for (int i = 0; i < chars.length; i++) {
                Arrays.fill(chars[i], ' ');
            }

            for (int i = 0; i < arrayList.size(); i++) {
                for (int j = 0; j < arrayList.get(i).length(); j++) {
                    chars[i][j] = arrayList.get(i).charAt(j);

                }

            }


            printarray(chars);

        }
    }

    public static void printarray(char[][] array) {
        for (int i =0; i <array[0].length; i++) {
            for (int j = array.length-1; j >=0; j--) {

                System.out.print(array[j][i]);

            }
            System.out.println();
        }
    }
}
