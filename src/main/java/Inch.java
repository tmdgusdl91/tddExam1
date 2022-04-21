public class Inch extends TransferLength{

    private double inch;

    public Inch (double inch) {
        this.inch = inch;
    }

    public double getInch() {
        return inch;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(inch * CENTIMETER_TO_INCH);
    }

}
