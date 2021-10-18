import java.util.*;

public class NestedForLoop_B {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter upperBound int: ");
        int upperBound = reader.nextInt();

        System.out.print("Enter lowerBound int: ");
        int lowerBound = reader.nextInt();


        for(int i = upperBound; i > 0; i--){
            for(int j = lowerBound; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
