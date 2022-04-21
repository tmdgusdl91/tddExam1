import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {

    @Test
    @DisplayName("toInch 성공")
    public void transToInchSuccess() {

        Centimeter cm = new Centimeter(10);

        Inch inch = cm.toInch();

        assertEquals(inch.getInch(), 3.937007874015748);

    }

    @Test
    @DisplayName("toInch 실패")
    public void transToInchFail() {

        Centimeter cm = new Centimeter(10);

        Inch inch = cm.toInch();

        assertEquals(inch.getInch(), 6.9370);
    }

    @Test
    @DisplayName("Inch to Meter 성공")
    public void inchToMeterSuccess() {

        Inch inch = new Inch(24.4);

        Centimeter centimeter = inch.toCentimeter();

        Meter meter = centimeter.toMeter();

        assertEquals(meter.getMeter(), 0.61976);
    }

    @Test
    @DisplayName("Meter To Yard 실패")
    public void MeterToYardFail() {

        Meter meter = new Meter(31.4);

        Centimeter centimeter = meter.toCentimeter();

        Yard yard = centimeter.toYard();

        assertEquals(meter.getMeter(), 0.81976);
    }

    @Test
    @DisplayName("Mile To Centimeter 실패")
    public void MileToCentimeterFail() {

        Mile mile = new Mile(31.4);

        Centimeter centimeter = mile.toCentimeter();

        assertEquals(centimeter.getCm(), 36125);
    }
}
