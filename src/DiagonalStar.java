public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        System.out.println("*");
                    } else if (j == 1 || j == number) {
                        System.out.println("*");
                    } else if (i == j) {
                        System.out.println("*");
                    } else if (j == number - i + 1) {
                        System.out.println("*");
                    } else if (j < number - i + 1) {
                        System.out.println(" ");
                    } else if (j > number - i + 1) {
                        System.out.println(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
