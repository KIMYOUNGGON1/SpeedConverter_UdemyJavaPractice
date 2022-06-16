public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {

        int divisor = 0;
        int rsltNumber = 0;

        boolean rslt = false;

        if (number < 1) {
            return rslt;
        }

        while (number > divisor) {

            divisor++;

            if (number % divisor == 0) {
                rsltNumber += divisor;
            }

            if (rsltNumber == number) {
                rslt = true;
            }
        }

    return rslt;
    }

}
