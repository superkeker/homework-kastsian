package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithOperatorTest {
    private final ICalculator calculator = new CalculatorWithOperator();

    @Test
    public void addition(){
        assertEquals(2, calculator.addition(1, 1));
    }
}