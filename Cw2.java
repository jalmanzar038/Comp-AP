import java.util.*;

public class Cw2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a price value: ");

        double p = reader.nextDouble();

        System.out.print("Enter the interest rate: ");

        double r = reader.nextDouble();

        System.out.print("Enter the number of years: ");

        int t = reader.nextInt();

        System.out.print("Number of times compounded in a year: ");

        int n = reader.nextInt();

        System.out.println("The amount of money made in " + t + " years will be, " +
                "$" + String.format("%.2f", (p*((Math.pow(1 +((r / 100)/n), n * t))))));




    }

}
