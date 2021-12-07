import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingAreaOfRectangle {
    public Rectangle area;
    public Rectangle perimeter;

    @Nested
    class Area {
        @BeforeEach
        public void setArea() {
            area = new Rectangle();
        }

        //*********************************Area of Rectangle*****************************
        @Test
        public void areaOfRectangleLengthFiveAndBreadthTwoIsTen() {
            double answer = area.area(5, 2);
            double expected = 10;
            assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleLengthTwoAndBreadthTwoIsFour() {
            double answer = area.area(2, 2);
            double expected = 4;
            assertEquals(answer, expected);


        }

        @Test
        public void areaOfRectangleLengthFourAndBreadthTwoIsEight() {
            double answer = area.area(4, 2);
            double expected = 8;
            assertEquals(answer, expected);

        }

        @Test
        public void areaOfRectangleLengthSixPointFiveBreadthFiveIsThirtyTwoPointFive() {
            double answer = area.area(6.5, 5);
            double expected = 32.5;
            assertEquals(answer, expected);
        }

        @Test
        public void throwExceptionWhenLengthAndBreadthBecomeNegative() {
            Assertions.assertThrows(ArithmeticException.class, () -> area.area(-2, -4));
        }

        @AfterAll
        public static void display() {
            System.out.println("ALL TEST CASE OF AREA SUCCESSFULLY PASSED");

        }
    }
    //********************************* Perimeter of Rectangle*****************************

        @Nested
        class TestingPerimeterFunction {
            @BeforeEach
            public void setPerimeter() {

                perimeter = new Rectangle();
            }

            @Test
            public void perimeterOfLengthEightAndBreadthThreeIsTwentyTwo() {
                double ans = perimeter.perimeter(8, 3);
                double expected = 22;
                assertEquals(ans, expected);
            }

            @Test
            public void perimeterOfLengthOfFiveAndBreadthThreeIsSixteen() {
                double ans = perimeter.perimeter(5, 3);
                double expected = 16;
                assertEquals(ans, expected);
            }

            @Test
            public void PerimeterForDecimalMeasurementsLengthOfTwoPointThreeAndBreadthOfFourPointFiveIsThirteenPointFive() {

                double ans = perimeter.perimeter(2.3, 4.5);
                double expected = 13.6;
                assertEquals(ans, expected);
            }

            @Test
            public void throwExceptionWhenMeasurementsBecomeNegativeOrZero() {
                Assertions.assertThrows(ArithmeticException.class, () -> perimeter.perimeter(-2, -4));
            }

            @AfterAll
            public static void display() {
                System.out.println("ALL TEST CASE OF PERIMETER SUCCESSFULLY PASSED");
            }
        }
}


