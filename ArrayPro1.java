import java.lang.reflect.Array;
import java.util.*;


public class ArrayPro1 {

    public static final String ANSI_Red = "\u001B[31m";

    public static final String ANSI_RESET = "\u001B[0m";

    public void printArrayPrimes(int[] aden, Primes reader){
        for (int i : aden) {
            if(reader.isPrime(i)) {
                System.out.print(ANSI_Red + i + " ");
            }else{
                System.out.print(ANSI_RESET + i + " ");
            }
        }
        System.out.println(ANSI_RESET);
    }

    public static void main(String[] args) {

        Primes reader = new Primes();

         int[] myList = new int[10];

         int counter = 0;

         for(int i =0; i < myList.length; i++){

             int randNum = (int)((Math.random()*100) + 1);

             myList[i] = randNum;
             if(myList[i] % 2 == 0){
                 counter += 1;
             }

         }
        ArrayPro1 caller = new ArrayPro1();

         caller.printArrayPrimes(myList, reader);
         System.out.println("This is the number of evens in your list! " + counter);
    }

}
