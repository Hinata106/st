import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeapYearCheckerTest {

    @Test
    public void testIsLeapYearForNonLeapYear() {
        int year = 2021;
        boolean expected = false;
        boolean actual = LeapYearChecker.isLeapYear(year);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsLeapYearForLeapYear() {
        int year = 2020;
        boolean expected = true;
        boolean actual = LeapYearChecker.isLeapYear(year);
        assertEquals(expected, actual);
    }
}
