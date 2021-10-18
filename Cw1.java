import java.util.*;

public class Cw1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[] tax = {.0625, .07, 0, .055, .0635};

        double userPrice = 0;

        double priceNineDown = 15.00;
        double priceTenFifteen = 12.50;
        double priceFifteenUp = 11.75;

        System.out.print("Enter a number of widgets: ");

        int userPick = reader.nextInt();

        if(userPick >= 0 && userPick <= 9){
            userPrice += priceNineDown * userPick;
            System.out.println(userPrice);
        } else if(userPick > 9 && userPick <= 15){
            userPrice += priceTenFifteen * userPick;
            System.out.println(userPrice);
        } else{
            userPrice += priceFifteenUp * userPick;
            System.out.println(userPrice);
        }

        System.out.print("Enter state you reside in: ");

        String userState = reader.next();

        switch (userState) {
            case "MA" -> System.out.println(String.format("%.2f", (userPrice + (userPrice * tax[0]))));
            case "RI" -> System.out.println(String.format("%.2f", (userPrice + (userPrice * tax[1]))));
            case "NH" -> System.out.println(String.format("%.2f", (userPrice + (userPrice * tax[2]))));
            case "ME" -> System.out.println(String.format("%.2f", (userPrice + (userPrice * tax[3]))));
            case "CT" -> System.out.println(String.format("%.2f", (userPrice + (userPrice * tax[4]))));
        }

    }

}
