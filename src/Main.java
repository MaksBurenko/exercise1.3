import java.util.*;

public class Main {
    public static void main(String[] args) {

        int t;
        int s;

        List<Integer> floors = new ArrayList<>();

        try {
            //       Scanner scanner = new Scanner(System.in);
            Scanner scanner = new Scanner("""
                    6  4
                    1  2  3  6  8  25
                    5""");

            while (scanner.hasNextLine()) {
                floors.add(scanner.nextInt());
            }

            t = floors.get(1);
            s = floors.getLast();

            floors.removeFirst();
            floors.removeFirst();
            floors.removeLast();

//            System.out.println("n = " + n + "\n" + "t = " + t + "\n" + "s = " + s);
//            System.out.println("Floors = " + floors);

            if (s-1 < t) {
                System.out.println(floors.getLast() - 1);
            } else {
                System.out.println((floors.get(s-1) - 1) + (floors.getLast() - 1));
            }

            scanner.close();

        } catch (IndexOutOfBoundsException | NoSuchElementException e) {
            e.printStackTrace(System.out);
        }
    }
}