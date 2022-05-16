

public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(0);

        boolean trueOrFalse = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(trueOrFalse);

    }
}
