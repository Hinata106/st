import org.junit.Test;
import static org.junit.Assert.*;

public class VotingSystemTest {

    @Test
    public void testVoteCount() {
        VotingSystem votingSystem = new VotingSystem();
        assertEquals(0, votingSystem.getVoteCount()); // Verifying the initial vote count

        votingSystem.vote();
        assertEquals(1, votingSystem.getVoteCount()); // Verifying the updated vote count

        votingSystem.vote();
        assertEquals(2, votingSystem.getVoteCount()); // Verifying the updated vote count
    }
}
