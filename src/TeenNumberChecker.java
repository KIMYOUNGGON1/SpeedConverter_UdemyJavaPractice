public class TeenNumberChecker {

    public static boolean hasTeen(int num_1, int num_2, int num_3) {
        if ((num_1 >= 13 && num_1 <= 19) || (num_2 >= 13 && num_2 <= 19) || (num_3 >= 13 && num_3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num_1) {
        if(num_1 >= 13 && num_1 <= 19) {
            return true;
        } else {
            return false;
        }
    }

}
