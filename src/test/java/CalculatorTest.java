import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(15.5, 10.2);
    }

    @Test
    public void canAdd(){
        assertEquals(25.7, calculator.addNumbers(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(5.3, calculator.subtractNumbers(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(158.1, calculator.multiplyNumbers(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(1.519607, calculator.divideNumbers(), 0.01);
    }

}
