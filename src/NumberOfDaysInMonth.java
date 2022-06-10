public class NumberOfDaysInMonth {

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

    public static int getDaysInMonth(int month, int year) {

        boolean checkLeapYear;
        int rsltInt = 0;

        if ((month < 1 && month > 12) || (year < 1 && year > 9999)) {
            rsltInt = -1;
        }

        checkLeapYear = isLeapYear(year);

        if(checkLeapYear) {
            switch (month) {
                case 1:
                    rsltInt = 31;
                    break;
                case 2:
                    rsltInt = 29;
                    break;
                case 3:
                    rsltInt = 31;
                break;
                case 4:
                    rsltInt = 30;
                break;
                case 5:
                    rsltInt = 31;
                break;
                case 6:
                    rsltInt = 30;
                break;
                case 7:
                    rsltInt = 31;
                break;
                case 8:
                    rsltInt = 31;
                break;
                case 9:
                    rsltInt = 30;
                break;
                case 10:
                    rsltInt = 31;
                break;
                case 11:
                    rsltInt = 30;
                break;
                case 12:
                    rsltInt = 31;
                break;
            }
        }

        return rsltInt;
    }

}
