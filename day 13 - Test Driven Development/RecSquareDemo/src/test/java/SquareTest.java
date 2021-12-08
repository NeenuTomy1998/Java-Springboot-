import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

class SquareTest {
    //**********************************************Area***********************************************

    @Nested
    class TestingAreaFunction{
        @Test
        public void areaOfSideFiveISTwentyFive(){
            Square squareObj = new Square(5);
            double area = squareObj.area();
            double exp = 25;
            Assertions.assertEquals(area,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square squareObj = new Square(-2);
                squareObj.area();
            });
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle squareObj = new Square(6.5);
            DecimalFormat df = new DecimalFormat("#.##");
            double area = squareObj.area();
            double exp = 42.25;
            Assertions.assertEquals(df.format(area),df.format(exp));
        }
    }

    //**********************************Perimeter**************************************************************

    @Nested
    class TestingPerimeterFunction{
        @Test
        public void perimeterOfSideFiveISTwenty(){
            Square squareObj = new Square(5);
            double perimeter = squareObj.perimeter();
            double exp = 20;
            Assertions.assertEquals(perimeter,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square squareObj = new Square(-2);
                squareObj.perimeter();
            });
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle squareObj = new Square(10.25);
            double perimeter = squareObj.perimeter();
            double exp = 41;
            Assertions.assertEquals(perimeter,exp);
        }
    }

}