import java.util.*;

public class NestedForLoop_D {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the upperBound int: ");
        int upperBound = reader.nextInt();

        System.out.print("Enter the lowerBound int: ");
        int lowerBound = reader.nextInt();

        String space = " ";
        for (int i = upperBound; i > 0; i--) {
            for(int j = lowerBound; j <= i; j++){
                if(upperBound-i !=0 && j == lowerBound){
                    for(int k = 0; k < upperBound-i; k++){
                        System.out.print(space + " ");
                    }
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}