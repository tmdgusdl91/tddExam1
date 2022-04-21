public class Meter extends TransferLength{

    private double meter;

    public double getMeter() {
        return meter;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(meter / CENTIMETER_TO_METER);
    }

    public Meter (double meter) {
        this.meter = meter;
    }

}
