import java.util.*;

public class CW3_1 {

    public static void main(String[] args) {
        double randi = 0;
        int randI = 0;
        for(int i = 0; i < 15; i++){
            // top range
            randi = Math.random()*21;
            // bottom range
            randI = (int) randi + 1;
            System.out.println(randi + " int is: " + randI);
        }


    }

}
