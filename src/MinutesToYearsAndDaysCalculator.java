public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays (long minutes) {

        long hour;
        long day;
        long remainingDay;
        long year;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            hour = minutes / 60;
            day = hour / 24;
            year = day / 365;
            remainingDay = day % 365;
            if (day >= 365) {
                System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
            } else {
                System.out.println(minutes + " min = " + year + " y and " + day + " d");
            }
        }
    }

}
