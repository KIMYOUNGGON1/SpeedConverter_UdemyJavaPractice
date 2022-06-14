public class TheWhileAndDoWhileStatements {

    public static void main(String[] args) {
        int count = 0;
        /*
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("**********");

        잘못된 예시.
        for (int i = 1; i < 7; i++) {
            System.out.println("Count value is " + count);
        }


        for (count = 1; count != 6; count++) {
            System.out.println("Count vaule is " + count);
        }

        System.out.println("***********");

        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }

        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6) ;

        */

        int number = 4;
        int finishNumber = 20;

        int evenNUmbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNUmbersFound++;

            if (evenNUmbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNUmbersFound);
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
