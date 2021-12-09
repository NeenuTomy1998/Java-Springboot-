import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTest{
    LengthConversion lengthConversion;
    @Test
    public void checkIfErrorWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new LengthConversion(0));
    }
    @Test
    public void checkIfErrorWhenLengthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new LengthConversion(-2));
    }

    @Nested
    class CentimeterToCentimeter {
        @Test
        public void checkIfOneCentimeterEqualToOneCentimeter() {
            lengthConversion = new LengthConversion(1);
            double actualLength = lengthConversion.centimeterToCentimeter();
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
   }

    @Nested
    class MeterToCentimeterTest {
        @Test
        public void checkIfOneMeterEqualToHundredCentimeter() {
            lengthConversion = new LengthConversion(1);
            double actualLength = lengthConversion.MeterToCentimeter();
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }

        @Nested
        class CentimeterToKilometerTest {
            @Test
            public void checkIfHundredCentimeterEqualToPointZeroZeroOneKilometer() {
                lengthConversion = new LengthConversion(100);
                double actualLength = lengthConversion.CentimeterToKilometer();
                double expectedLength = 0.001;
                assertEquals(expectedLength, actualLength);
            }
        }
    }
}
