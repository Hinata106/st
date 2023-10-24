import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialForZero() {
        int n = 0;
        int expectedFactorial = 1;
        int actualFactorial = FactorialCalculator.calculateFactorial(n);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        int n = 5;
        int expectedFactorial = 120;
        int actualFactorial = FactorialCalculator.calculateFactorial(n);
        assertEquals(expectedFactorial, actualFactorial);
    }
}
