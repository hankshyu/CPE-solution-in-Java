import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class allRoadsLeadWhere {
    public static ArrayList<City> allCities;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalcases = Integer.parseInt(scanner.nextLine());
        while (totalcases-- > 0) {
            allCities=new ArrayList<City>();
            allCities.add(new City("Rome", null));
            scanner.nextLine();
            String[] informations = scanner.nextLine().split("\\s+");
            int buildingnum = Integer.parseInt(informations[0]);
            int asknum = Integer.parseInt(informations[1]);

            while (buildingnum-- > 0) {
                String[] cityconnections = scanner.nextLine().split("\\s+");
                String from = cityconnections[0];
                String to = cityconnections[1];

                if (!hascity(to)) {
                    City newcity = new City(to, getCity(from));
                    allCities.add(newcity);
                }
                City cityfrom=getCity(from);
                City cityto = getCity(to);

                connectCities(cityfrom,cityto);
            }
            while (asknum-- > 0) {
                //start looking for route
                LinkedList<City> fromcityroute = new LinkedList<>();
                LinkedList<City> tocityroute = new LinkedList<>();

                String[] cityconnections = scanner.nextLine().split("\\s+");
                String from = cityconnections[0];
                String to = cityconnections[1];

                City fromcity = getCity(from);
                City tocity = getCity(to);

                while (fromcity != null) {
                    fromcityroute.push(fromcity);
                    fromcity=fromcity.parent;
                }
                while (tocity != null) {
                    tocityroute.push(tocity);
                    tocity=tocity.parent;
                }

               City root=null;
                while (fromcityroute.get(0) == tocityroute.get(0)) {
                    root=fromcityroute.get(0);
                    fromcityroute.poll();
                    tocityroute.poll();
                }
                while (!fromcityroute.isEmpty()) {
                    City city=fromcityroute.pop();
                    System.out.print(city.getNickName());
                }
                System.out.print(root.getNickName());
                while (!tocityroute.isEmpty()) {
                    City city=tocityroute.poll();
                    System.out.print(city.getNickName());

                }
                System.out.println();



            }


        }
    }

    public static City getCity(String cityname) {
        for (City allCity : allCities) {
            if (allCity.cityName.equals(cityname)) {
                return allCity;
            }
        }
        return null;
    }

    public static void connectCities(City from, City to) {
        to.parent=from;
        from.addkids(to);
    }

    public static boolean hascity(String string) {
        for (City ct : allCities) {
            if (ct.cityName.equals(string)) {
                return true;
            }
        }
        return false;
    }

    static class City implements Comparable<City> {
        public String cityName;
        public City parent;
        public ArrayList<City> kids;

        public City(String cityName, City parent) {
            this.cityName = cityName;
            this.parent = parent;
            kids = new ArrayList<City>();
        }

        public void addkids(City kid) {
            if(kid!=null)
            this.kids.add(kid);
        }

        public char getNickName() {
            return this.cityName.charAt(0);
        }


        @Override
        public int compareTo(City o) {
            if (this.cityName.equals(o.cityName)) {
                return 0;
            }

            return 1;
        }
    }
}
