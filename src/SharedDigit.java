public class SharedDigit {

    public static boolean hasSharedDigit (int number_1, int number_2) {

        int firstNumber1, lastNumber1, firstNumber2, lastNumber2;

        if ((number_1 < 11 || number_1 > 100) || (number_2 < 11 || number_2 > 100)) {
            System.out.println("Please Enter The Valid Input Ranging 10 - 99 ");
            return false;
        }

        lastNumber1 = number_1 % 10;
        firstNumber1 = number_1 / 10;
        lastNumber2 = number_2 % 10;
        firstNumber2 = number_2 / 10;

        if ((lastNumber1 == lastNumber2) || (lastNumber1 == firstNumber2) ||
                (firstNumber1 == firstNumber2) || (firstNumber1 == lastNumber2)) {
            System.out.println("Numbers have a shared digit ");
            return true;
        }

        System.out.println("Numbers does not have any shared digits");
        return false;
    }
}
