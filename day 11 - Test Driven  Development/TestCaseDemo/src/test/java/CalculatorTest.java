import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public Calculator calc;

    @Nested
    class TestingAddFunction {
        @BeforeEach
        public void setCalc() {
            calc = new Calculator();
        }

        //*********************************Addition*****************************
        @Test
        public void checkFiveAddEightGivesEight() {
            double answer = calc.addition(5, 3);
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkFiveAddFiveGivesTen() {
            double answer = calc.addition(5, 5);
            double expected = 10;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkFiveAddZeroGivesFive() {
            double answer = calc.addition(5, 0);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }

    }
//**************************substraction***********************

    @Nested
    class TestingSubFunction {
        @BeforeEach
        public void setCalc() {
            calc = new Calculator();
        }

        @Test
        public void checkFiveMinusThreeGivesTwo() {
            double answer = calc.substraction(5, 3);
            double expected = 2;
            Assertions.assertEquals(answer, expected);
        }


        @Test
        public void checkFiveMinusFiveGivesZero() {
            double answer = calc.substraction(5, 5);
            double expected = 0;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkThreeMinusFiveGivesNegativeTwo() {
            double answer = calc.substraction(3, 5);
            double expected = -2;
            Assertions.assertEquals(answer, expected);
        }
    }

    //*********************************Division*****************************************
    @Nested
    class TestingDivFunction {
        @BeforeEach
        public void setCalc() {
            calc = new Calculator();
        }

        @Test
        public void checkFiveDivOneGivesFive() {
            double answer = calc.division(5, 1);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkFiveDivFiveGivesOne() {
            double answer = calc.division(5, 5);
            double expected = 1;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwsExceptionWhenDividedByZero() {
            Assertions.assertThrows(ArithmeticException.class, () -> calc.division(5, 0));
        }
    }

    //*****************Multiplication************************************************
    @Nested
    class TestingMulFunction {
        @BeforeEach
        public void setCalc() {
            calc = new Calculator();
        }

        @Test
        public void checkFiveMulFiveGivesOne() {
            double answer = calc.mulitiplication(5, 5);
            double expected = 25;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkFiveMulTenGivesFifty() {
            double answer = calc.mulitiplication(5, 10);
            double expected = 50;
            Assertions.assertEquals(answer, expected);
        }
    }
}




