public class SumOdd {

    public static boolean isOdd (int number) {

        boolean checkRslt = false;

        if (number > 0) {
            if (number % 2 != 0) {
                checkRslt = true;
            }
        }

        return checkRslt;
    }

    public static int sumOdd (int start, int end) {

        int sumRslt = 0;

        if ((start > 0 && end > 0) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumRslt += i;
                }
            }
        } else {
            sumRslt = -1;
        }
        return sumRslt;
    }

}
