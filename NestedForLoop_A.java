import java.util.*;
public class NestedForLoop_A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter upperBound int: ");
        int upperBound = reader.nextInt();

        System.out.print("Enter lowerBound int: ");
        int lowerBound = reader.nextInt();

        nestA(lowerBound, upperBound);

    }

    public static void nestA(int low, int high){
        for(int i = low; i <= high; i++){
            for(int j = low; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
