public class Yard extends TransferLength{

    private double yard;

    public double getYard() {
        return yard;
    }

    public Yard (double yard) {
        this.yard = yard;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(yard * CENTIMETER_TO_YARD);
    }

}
