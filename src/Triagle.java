public class Triagle {
    public static boolean isValid(double side1, double side2, double side3) {
        if (((side1 + side2) >= side3) &&
                ((side1 + side3) >= side2) &&
                ((side3 + side2) >= side1)) {
            return true;
        }
        return false;
    }


    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
