import java.util.*;

public class mutantFlatWorldWarrior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] restrictions = scanner.nextLine().split("\\s+");
        int maxX = Integer.parseInt(restrictions[0]);
        int maxY = Integer.parseInt(restrictions[1]);
        ArrayList<String> walls = new ArrayList<>();


        while (scanner.hasNextLine()) {
            boolean outbreak = false;
            int currentx = 0;
            int currenty = 0;
            char currentfacing = ' ';
            String[] split = scanner.nextLine().split("\\s+");
            currentx = Integer.parseInt(split[0]);
            currenty = Integer.parseInt(split[1]);
            currentfacing = (split[2]).charAt(0);
            String moves = scanner.nextLine();
            for (int i = 0; i < moves.length(); i++) {
                char command = moves.charAt(i);
                switch (command) {
                    case 'L':
                        currentfacing=turning(currentfacing, 'L');
                        break;
                    case 'R':
                        currentfacing=turning(currentfacing, 'R');
                        break;
                    case 'F':
                        int nextx = 0;
                        int nexty = 0;
                        switch (currentfacing) {
                            case 'N':
                                nextx = currentx - 1;
                                nexty = currenty;
                                break;
                            case 'S':
                                nextx = currentx + 1;
                                nexty = currenty;
                                break;
                            case 'E':
                                nextx = currentx;
                                nexty = currenty + 1;
                                break;
                            case 'W':
                                nextx = currentx;
                                nexty = currenty - 1;
                                break;
                        }
                        if (nextx < 0 || nexty < 0 || nextx > maxX || nexty > maxY) {
                            if (walls.contains(currentx + " " + currenty)) {
                                continue;
                            } else {
                                outbreak = true;
                                walls.add(currentx + " " + currenty);
                                break;

                            }
                        }
                        currentx = nextx;
                        currenty = nexty;


                }

            }
            System.out.print( currentx+" "+currenty+" "+currentfacing);
            if (outbreak) {
                System.out.println(" " + "LOST");

            } else {
                System.out.println();
            }


        }

    }

    public static char turning(char curfacing, char instructions) {
        switch (curfacing) {
            case 'N':
                if (instructions == 'L') {
                    return  'W';
                } else if (instructions == 'R') {
                    return  'E';
                }
                break;

            case 'E':
                if (instructions == 'L') {
                    return  'N';
                } else if (instructions == 'R') {
                    return  'S';
                }
                break;
            case 'S':
                if (instructions == 'L') {
                    return  'E';
                } else if (instructions == 'R') {
                    return  'W';
                }
                break;
            case 'W':
                if (instructions == 'F') {
                    return  'L';
                } else if (instructions == 'R') {
                    return  'N';
                }
                break;
        }
        return curfacing;
    }


}
