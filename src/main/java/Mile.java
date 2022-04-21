public class Mile extends TransferLength{

    private double mile;

    public double getMile() {
        return mile;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(mile * CENTIMETER_TO_MILE);
    }

    public Mile (double mile) {
        this.mile = mile;
    }

}
