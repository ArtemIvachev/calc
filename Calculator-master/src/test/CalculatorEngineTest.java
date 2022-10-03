import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorEngineTest {

    private CalculatorEngine calcEngine = new CalculatorEngine();
    private CalculatorView calcView = new CalculatorView();

    @Before
    public void runBeforeEveryTest() {
//        calcView.actionClear();
        calcEngine.currentTotal = 0;
    }

    @Test
    public void testEqual() throws Exception {
        calcEngine.equal("25");
        assertEquals(calcEngine.currentTotal, 25.0);
    }

    @Test
    public void testAdd() throws Exception {
        calcEngine.add(15);
        calcEngine.add(20);
        assertEquals(calcEngine.currentTotal, 35.0);
    }

    @Test
    public void testSubtract() throws Exception {
        calcEngine.add(42);
        calcEngine.subtract(11);
        assertEquals(calcEngine.currentTotal, 31.0);
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        calcEngine.multiply(10);
        assertEquals(calcEngine.currentTotal, 0.0);
    }

    @Test
    public void testDivideByZero() throws Exception {
        calcEngine.divide(10);
        assertEquals(calcEngine.currentTotal, 0.0);
        System.out.println("Can't divide by zero!");
    }

    @Test
    public void testMultiply() throws Exception {
        calcEngine.add(15);
        calcEngine.multiply(2);
        assertEquals(calcEngine.currentTotal, 30.0);
    }

    @Test
    public void testDivide() throws Exception {
        calcEngine.add(20);
        calcEngine.divide(2);
        assertEquals(calcEngine.currentTotal, 10.0);
    }
}