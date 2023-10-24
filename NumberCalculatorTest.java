import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberCalculatorTest {

    @Test
    public void testFindSquare() {
        double number = 5.0;
        double expectedSquare = 25.0;
        double actualSquare = NumberCalculator.findSquare(number);
        assertEquals(expectedSquare, actualSquare, 0.0001);
    }

    @Test
    public void testFindCube() {
        double number = 3.0;
        double expectedCube = 27.0;
        double actualCube = NumberCalculator.findCube(number);
        assertEquals(expectedCube, actualCube, 0.0001);
    }
}
