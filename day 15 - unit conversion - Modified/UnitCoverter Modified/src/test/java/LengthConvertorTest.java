import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LengthConvertorTest {
    private LengthConvertor lengthConverterObj;
    @BeforeEach
    public void setup(){
        lengthConverterObj = new LengthConvertor();

    }
    @Test
    public void checkOneCentimeterEqualsToOneCentimeter(){
        double actualValue = lengthConverterObj.convertor(1,"cm","cm");
        double expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkMeterToCentimeterConvertor(){
        double actualValue = lengthConverterObj.convertor(1,"m","cm");;
        double expectedValue = 100;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkCentimeterToKilometer(){
        double actualValue = lengthConverterObj.convertor(100,"cm","km");;
        double expectedValue = 0.001;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySumOfOneMeterAndHundredCentimeterGivesTwoMeter(){
        double actualValue = 1 + lengthConverterObj.convertor(100,"cm","m");;
        double expectedValue = 2;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySumOfTwoHundredCentimeterAndOneKilometerGivesOneLakhTwoHundredCentimeter(){
        double actualValue = 200 + lengthConverterObj.convertor(1,"km","cm");;
        double expectedValue = 100200;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySubtractionOfOneMeterAndFiftyCentiMeterGivesPointFiveMeter(){
        double actualValue = 1 - lengthConverterObj.convertor(50,"cm","m");;
        double expectedValue = 0.5;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySubtractionOfTwoThousandCentimeterAndOneMeterGivesThousandNineHundredCentimeter(){
        double actualValue = 2000 - lengthConverterObj.convertor(1,"m","cm");;
        double expectedValue = 1900;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            lengthConverterObj.convertor(-1,"cm","cm");
        });
    }
}