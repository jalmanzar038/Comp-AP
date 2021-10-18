import java.util.*;
public class Primes {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a prime number: ");

        int userPrime = reader.nextInt();

        Primes obj = new Primes();
        System.out.println(obj.isPrime(userPrime));
    }

    public boolean isPrime(int userPrime){

        double userRoot = Math.sqrt(userPrime);

        int userRound = (int) Math.round(userRoot);

        int counter = 0;

        for(int i = 2; i <= userRound; i++) {

            if(userPrime % i == 0){
                counter += 1;
            }

        }
        if(counter > 0){
            return false;

        } else{
            return true;
        }
    }

}
