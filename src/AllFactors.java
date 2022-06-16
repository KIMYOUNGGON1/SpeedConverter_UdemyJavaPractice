public class AllFactors {

    public static void printFactors (int number) {

        int divisor = 0;

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        while (number > divisor) {
            divisor++;

            if (number % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }

}
