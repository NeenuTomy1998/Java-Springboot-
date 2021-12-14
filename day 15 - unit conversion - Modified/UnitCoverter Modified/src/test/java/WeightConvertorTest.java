import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class WeightConvertorTest {
    private WeightConvertor weightConverterObj;

    @BeforeEach
    public void setup(){
        weightConverterObj = new WeightConvertor();

    }
    @Test
    public void checkOneGramEqualsToOneGram(){
        double actualValue = weightConverterObj.convertor(1,"g","g");
        double expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkKilogramToGramConvertor(){
        double actualValue = weightConverterObj.convertor(0.1,"kg","g");;
        double expectedValue = 100;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySumOfTenGramAndOneKilogramGivesOneThousandOneHundredAndTenGram(){
        double actualValue = 10 + weightConverterObj.convertor(1,"kg","g");;
        double expectedValue = 1010;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySubtractionOfOnePointFiveGramAndFiveHundredGramGivesOneKilogram(){
        double actualValue = 1.5 - weightConverterObj.convertor(500,"g","kg");;
        double expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            weightConverterObj.convertor(-1,"g","g");
        });
    }
}