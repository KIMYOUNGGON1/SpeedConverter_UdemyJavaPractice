import java.util.ArrayList;
import java.util.List;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

       if (hourOfDay >= 0 && hourOfDay <= 23) {
           if (barking == true) {
               if(hourOfDay < 8 || hourOfDay > 22) {
                   return true;
               } else {
                   return false;
               }
           } else {
               return false;
           }
       } else {
           return false;
       }
    }
}
