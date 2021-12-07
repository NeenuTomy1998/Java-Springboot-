import org.junit.jupiter.api.*;

public class TestCaseAreaOfRectangle {
    public Rectangle area;
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
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleLengthTwoandBreadthTwoIsFour() {
            double answer = area.area(2, 2);
            double expected = 4;
            Assertions.assertEquals(answer, expected);


        }

        @Test
        public void areaOfRectangleLengthFourandBreadthTwoIsEight() {
            double answer = area.area(4, 2);
            double expected = 8;
            Assertions.assertEquals(answer, expected);

        }
        @Test
        public void areaOfRectangleLengthSixPointFiveBreadthFiveIsThirtyTwoPointFive() {
            double answer = area.area(6.5, 5);
            double expected = 32.5;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void throwExceptionWhenLengthAndBreadthBecomeNegative(){
            Assertions.assertThrows(ArithmeticException.class, () -> area.area(-2,-4));
        }
        @AfterAll
        public static void display(){
            System.out.println("ALL TEST CASE SUCCESSFULLY PASSED");
        }
    }
}
