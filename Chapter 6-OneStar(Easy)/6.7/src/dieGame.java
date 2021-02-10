import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class dieGame {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int moves = Integer.parseInt(scanner.nextLine());
            while (moves-- > 0) {
                String move=scanner.nextLine();
                switch (move) {
                    case "north":
                        dice.rollnorth();
                        break;
                    case "south":
                        dice.rollsouth();
                        break;
                    case "east":
                        dice.rolleast();
                        break;
                    case "west":
                        dice.rollwest();
                        break;
                }
            }
            System.out.println(dice.up);
        }


    }
}

class Dice {
    int up = 1;
    int down = 6;
    int north = 2;
    int south = 5;
    int east = 4;
    int west = 3;

    private void change(int a, int b, int c, int d) {
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;
    }

    public void rollnorth() {
        change(north, up, south, down);

    }

    public void rollsouth() {
        change(south, up, north, down);
    }

    public void rolleast() {
        change(east, up, west, down);
    }

    public void rollwest() {
        change(west, up, east, down);
    }
}
