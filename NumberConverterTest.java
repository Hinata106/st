import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberConverterTest {

    @Test
    public void testDecimalToBinary() {
        int decimal = 10;
        String expectedBinary = "1010";
        String actualBinary = NumberConverter.decimalToBinary(decimal);
        assertEquals(expectedBinary, actualBinary);
    }

    @Test
    public void testDecimalToOctal() {
        int decimal = 20;
        String expectedOctal = "24";
        String actualOctal = NumberConverter.decimalToOctal(decimal);
        assertEquals(expectedOctal, actualOctal);
    }
}
