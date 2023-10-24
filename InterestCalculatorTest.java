import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InterestCalculatorTest {

    @Test
    public void testCalculateSimpleInterestForSeniorCitizen() {
        double principal = 1000;
        double time = 2;
        String customerType = "Senior Citizen";

        double expectedInterest = principal * 0.12 * time;
        double actualInterest = InterestCalculator.calculateSimpleInterest(principal, time, customerType);

        assertEquals(expectedInterest, actualInterest, 0.001);
    }

    @Test
    public void testCalculateSimpleInterestForRegularCustomer() {
        double principal = 1500;
        double time = 3;
        String customerType = "Other";

        double expectedInterest = principal * 0.10 * time;
        double actualInterest = InterestCalculator.calculateSimpleInterest(principal, time, customerType);

        assertEquals(expectedInterest, actualInterest, 0.001);
    }
}
