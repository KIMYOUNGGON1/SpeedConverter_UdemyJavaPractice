public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double decimal_1, double decimal_2) {
        return (int)(decimal_1 * 1000) == (int)(decimal_2 * 1000);
    }

}
