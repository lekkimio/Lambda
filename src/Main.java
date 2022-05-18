import java.util.Arrays;

public class Main {
        public static void main( String[] args ) {
            House h1 = new  House("Vinnitsia", 14, 4,50);
            House h2 = new House("Kiyv", 10, 3,29);
            House h3 = new House("Vinnitsia", 4, 3,20);
            House h4 = new House("Kiyv", 6, 2,25);
            House h5 = new House("Donetsk", 3, 1,10);
            House[] houseArray = {h1, h2, h3, h4, h5};

            //city sort
            System.out.println("----------- sorted by City");
            Arrays.sort(houseArray, (House m, House n) -> m.getCity().compareTo(n.getCity()));
            printHouses(houseArray);

            //roomCount sort
            System.out.println("----------- sorted by Room");
            Arrays.sort(houseArray, (House m, House n) -> m.getRoomCount()-n.getRoomCount());
            printHouses(houseArray);

            //height sort
            System.out.println("----------- sorted by Height");
            Arrays.sort(houseArray, (House m, House n) -> m.getHeight()-n.getHeight());
            printHouses(houseArray);

            //width sort
            System.out.println("----------- sorted by Width");
            Arrays.sort(houseArray, (House m, House n) -> m.getWidth()-n.getWidth());
            printHouses(houseArray);

            /*System.out.println("----------- sorted by City");
            //city sort
            Stream<House> houseStream = Stream.of(houseArray);
            Stream<House> sortedHouseCity = houseStream.sorted(Comparator.comparing((House m) -> m.getCity()));
            sortedHouseCity.forEach(d -> System.out.print(d));

            System.out.println("----------- sorted by Room");
            //roomCount sort
            Stream<House> houseStream2 = Stream.of(houseArray);
            Stream<House> sortedHouseRoom = houseStream2.sorted(Comparator.comparingInt((House m) -> m.getRoomCount()));
            sortedHouseRoom.forEach(d -> System.out.print(d));

            System.out.println("----------- sorted by Height");
            //height sort
            Stream<House> houseStream3 = Stream.of(houseArray);
            Stream<House> sortedHouseHeight = houseStream3.sorted(Comparator.comparingInt((House m) -> m.getHeight()));
            sortedHouseHeight.forEach(d -> System.out.print(d));

            System.out.println("----------- sorted by Width");
            //width sort
            Stream<House> houseStream4 = Stream.of(houseArray);
            Stream<House> sortedHouseWidth = houseStream4.sorted(Comparator.comparingInt((House m) -> m.getWidth()));
            sortedHouseWidth.forEach(d -> System.out.print(d));*/
        }

    public static void printHouses(House[] houses) {
        System.out.println("House List");
        for (House h : houses)
            System.out.print(h);
        System.out.println();
    }
    }