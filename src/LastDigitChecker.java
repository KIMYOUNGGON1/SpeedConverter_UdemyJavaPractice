public class LastDigitChecker {

    public static boolean hasSameLastDigit (int number_1, int number_2, int number_3) {

        int lastNumber1, lastNumber2, lastNumber3;

        if((number_1 < 10 || number_1 > 1000) || (number_2 < 10 || number_2 > 1000) || (number_3 < 10 || number_3 > 1000)) {
            System.out.println("Please Enter the valid input ranging 10 - 1000 ");
            return false;
        }

        lastNumber1 = number_1 % 10;
        lastNumber2 = number_2 % 10;
        lastNumber3 = number_3 % 10;

        if ((lastNumber1 == lastNumber2) || (lastNumber1 == lastNumber3) ||
                (lastNumber2 == lastNumber3)) {
            System.out.println("Last number digit have a shared digit ");
            return true;
        }

        System.out.println("Numbers does not have any shared digits");
        return false;
    }

    public static boolean isValid (int number) {

        if ((number < 10 || number > 1000)) {
            return false;
        } else {
            return true;
        }

    }

}
