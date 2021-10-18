import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random lotto = new Random();

        int x = lotto.nextInt(101);

        int lottoNum = 0;

        if (x < 10) {
            x += 10;
            lottoNum = x;
        } else {
            lottoNum = x;
        }

        System.out.println(lottoNum);

        System.out.print("Enter a two digit number: ");

        int userNum = input.nextInt();

        if (userNum == lottoNum) {
            System.out.println("You have won the grand prize: $10,000");
        } else if(userNum/10 == lottoNum % 10 && userNum % 10 == lottoNum / 10){
            System.out.println("You have wont the prize of $3,000");
        } else if ((userNum % 10 == lottoNum % 10 || userNum % 10 == lottoNum / 10)
                || (userNum / 10 == lottoNum%10 || userNum/10 == lottoNum/10)) { //this line need work
            System.out.println("You have won the prize of $1,000!");
        }else{
            System.out.println(lottoNum);
            System.out.println("Darn, I guess you didn't GUESS correctly!!! Muahahhahahahhahahhaaaaaa");
        }

    }
}