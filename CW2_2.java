import java.util.*;


public class CW2_2 {

    public static void main(String[] args) {
        /*
        System.out.println("Dollars: " + (int)dollars);

        double leftover = money - dollars;

        double quarters = Math.floor((leftover / .25));

        System.out.println("Quarters: " + (int)quarters);

        double update = money - ((dollars) + (quarters * .25));

        double dimes = Math.floor(update / .10);

        System.out.println("Dimes: " + (int)(dimes));

        update = money - ((dollars) + (quarters * .25) + (dimes * .10));

        double nickels = Math.floor(update / .05);

        System.out.println("Nickels: " + (int)nickels);

        update = money - ((dollars) + (quarters * .25) + (dimes * .10) + ( nickels * .05));

        System.out.println("Pennies: " + (int) Math.ceil(update));
        */

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");

        double money = reader.nextDouble();

        int dollars = (int) money;

        System.out.println("Dollars: " + dollars);

        double leftover = Math.round((money - dollars) * 100);
        int leftoverInt = (int) leftover;

        int quarters = leftoverInt/25;
        System.out.println("Quarters: " + quarters);

        leftover = Math.round((money - (dollars + (quarters*25)/100.0)) * 100);
        leftoverInt = (int)leftover;

        int dimes = leftoverInt/10;
        System.out.println("Dimes: " + dimes);

        leftover = Math.round((money - (dollars + (quarters*25)/100.0 + (dimes * 10)/100.0)) * 100.0);
        leftoverInt = (int)leftover;

        int nickels = leftoverInt/5;
        System.out.println("Nickels: " + nickels);

        leftover = Math.round((money - (dollars + (quarters * 25)/100.0 + (dimes * 10)/100.0 + (nickels * 5)/100.0))*100);
        leftoverInt = (int) leftover;

        System.out.println("Pennies: " + leftoverInt);




    }

}
