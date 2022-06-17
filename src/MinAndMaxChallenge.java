import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int minimumValue = 0;
//        int minimumValue = 2147483647;
        int minimumValue = Integer.MAX_VALUE;
//        int maximumValue = 0;
//        int maximumValue = -2147483648;
        int maximumValue = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int userInput = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    minimumValue = userInput;
//                    maximumValue = userInput;
//                }

                if (userInput > maximumValue) {
                    maximumValue = userInput;
                }

                if (userInput < minimumValue) {
                    minimumValue = userInput;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("The minimum value is " + minimumValue + " and maximum value is " + maximumValue);
        scanner.close();

    }

}
