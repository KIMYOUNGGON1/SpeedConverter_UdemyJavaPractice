import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        long avg = Math.round((double) sum / (int) count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
