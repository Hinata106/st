import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparatorTest {

    StringComparator stringComparator = new StringComparator();

    @Test
    public void testStringComparison() {
        // Test case 1: Equal strings
        String str1 = "Hello";
        String str2 = "Hello";
        assertTrue(stringComparator.compareStrings(str1, str2));

        // Test case 2: Different strings
        String str3 = "Hello";
        String str4 = "World";
        assertFalse(stringComparator.compareStrings(str3, str4));
    }
}
