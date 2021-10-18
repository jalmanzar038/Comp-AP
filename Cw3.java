import java.util.*;

public class Cw3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your first x-coordinate: ");

        double userX1 = reader.nextDouble();

        System.out.print("Enter your first y-coordinate: ");

        double userY1 = reader.nextDouble();

        System.out.print("Enter your second x-coordinate: ");

        double userX2 = reader.nextDouble();

        System.out.print("Enter your second y-coordinate: ");

        double userY2 = reader.nextDouble();

        System.out.println("The distance between these two points is " +
                Math.sqrt(Math.pow((userX2-userX1), 2) + Math.pow((userY2-userY1), 2)));

    }

}
