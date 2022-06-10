public class AreaCalculator {

    public static double area(double radius) {

        double circleArea;

        if(radius < 0) {
            return -1.0;
        }

        circleArea = radius * radius * Math.PI;

        return circleArea;
    }

    public static double area(double x, double y) {

        double rectangleArea;

        if((x < 0) || (y < 0)) {
            return -1.0;
        }

        rectangleArea = x * y;

        return rectangleArea;
    }
}
