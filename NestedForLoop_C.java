import java.util.*;

public class NestedForLoop_C {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter upperBound int: ");
        int upperBound = reader.nextInt();

        System.out.print("Enter lowerBound int: ");
        int lowerBound = reader.nextInt();

        String space = " ";
        for(int i = lowerBound; i <= upperBound; i++){
            boolean flag = true;
            for(int j = upperBound; flag; j--){
                if(j > i){
                    System.out.print(space);
                }else if(j != 0){
                    System.out.print(j);
                }
                if(j < 1){
                    flag = false;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
