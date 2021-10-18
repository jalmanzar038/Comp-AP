import java.lang.reflect.Array;
import java.util.*;

public class ArraysPro2 {

    public static int[] randomizer(int[] group){
        for(int i = 0; i < group.length; i++){
            int random = (int)(Math.random()*200);
            group[i] = random;
        }

        return group;
    }

    public static void main(String[] args) {

        Primes checker = new Primes();

        ArrayPro1 caller = new ArrayPro1();

        int[] order = new int[25];

        int[] newOrder = randomizer(order);

        int counter = 0;

        for(int j = 0; j < newOrder.length; j++){
            if(checker.isPrime(newOrder[j])){
                counter += 1;
            }
        }

        caller.printArrayPrimes(newOrder, checker);

        System.out.println("There are " + counter + " primes in your list!");

    }


}
