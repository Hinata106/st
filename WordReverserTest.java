import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordReverserTest {

    @Test
    public void testReverseWord() {
        WordReverser wordReverser = new WordReverser();

        String input = "Hello";
        String expectedOutput = "olleH";
        String actualOutput = wordReverser.reverseWord(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
