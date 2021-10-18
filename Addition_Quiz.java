import java.util.Scanner;

public class Addition_Quiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long milliTime = System.currentTimeMillis();

        long rand1 = milliTime % 1000;

        long milliTime2 = System.currentTimeMillis();

        long rand2 = milliTime2 % 3600;

        System.out.print("Enter the answer to " + rand1 + " + " + rand2 + ": ");

        int userAnswer = input.nextInt();

        if(userAnswer == rand1+rand2){
            System.out.println(rand1 + " + " + rand2 + " = " + userAnswer + " is true");
        }else{
            System.out.println(rand1 + " + " + rand2 + " = " + userAnswer + " is false");
        }




    }

}
