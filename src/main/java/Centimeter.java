public class Centimeter extends TransferLength{

    private double cm;

    public Centimeter(double cm) {
        this.cm = cm;
    }

    public double getCm() {
        return cm;
    }

    public Inch toInch() {
        return new Inch(cm / CENTIMETER_TO_INCH);
    }

    public Meter toMeter() {
        return new Meter(cm / CENTIMETER_TO_METER);
    }

    public Mile toMile() {
        return new Mile(cm / CENTIMETER_TO_MILE);
    }

    public Yard toYard() {
        return new Yard(cm / CENTIMETER_TO_YARD);
    }
}
