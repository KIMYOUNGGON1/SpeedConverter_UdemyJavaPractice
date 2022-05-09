public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }

        long milePerHour = Math.round(kilometerPerHour / 1.609);

    }
}
