//clock
public class CW2_1 {

    public static void main(String[] args) {
        
        CW2_1 caller = new CW2_1();
        
        caller.GreenwhichClock();
        
        

    }
    
    public void GreenwhichClock(){
        long totalMilliSeconds = System.currentTimeMillis();
        long seconds = totalMilliSeconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long hourTime = hours % 24;
        long minTime = minutes % 60;
        long secTime = seconds % 60;
        long hoursAdjusted = hourTime-4;
        if(hoursAdjusted > 12){
            hoursAdjusted -= 12;
            System.out.println(hoursAdjusted + ":" + minTime + " PM");
        } else{
            System.out.println(hoursAdjusted + ":" + minTime + " AM");
        }
    }

}
