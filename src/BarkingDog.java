import java.util.ArrayList;
import java.util.List;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || 23< hourOfDay) {
            barking = false;
        }
        else if (hourOfDay <= 8 || 22 <= hourOfDay) {
            barking = true;
        } else {
            barking = false;
        }
        return barking;
    }
}
