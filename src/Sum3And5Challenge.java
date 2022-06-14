public class Sum3And5Challenge {

    public static void main(String[] args) {

        int rsltNumber = 0;
        int sumNumber = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("This number is can divide by 3 and 5 : " + i);
                rsltNumber++;
                sumNumber += i;
                if (rsltNumber == 5) {
                    System.out.println("The number can be divide by 3 and 5 number's sum is : " + sumNumber);
                    break;
                }
            }
        }

    }

}
