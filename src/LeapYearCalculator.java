public class LeapYearCalculator {

    public static boolean isLeapYear (int year) {

        boolean isThisYearLeapYear = false;

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isThisYearLeapYear = true;
                        return isThisYearLeapYear;
                    } else {
                        return isThisYearLeapYear;
                    }
                } else {
                    isThisYearLeapYear = true;
                    return isThisYearLeapYear;
                }
            }
        } else {
            return isThisYearLeapYear;
        }
        return isThisYearLeapYear;
    }
}
