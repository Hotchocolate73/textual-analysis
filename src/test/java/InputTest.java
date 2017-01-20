import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Dylan on 20/01/2017.
 */
public class InputTest
{
    @Test
    public void createMessageFromFileSuccessfully() throws IOException
    {
        AnalysisMessage message = new AnalysisMessage();

        message.createMessageFromFile();

        assertNotEquals(message.getMessage(), "");
    }

    @Test
    public void countWordsInStringTest(){
        AnalysisMessage message = new AnalysisMessage();
        message.setMessage("one two three");

        int numberOfWords = message.countWords();

        assertEquals(numberOfWords, 3);
    }

    @Test
    public void checkIfStringCountsEscapeCharacters(){
        AnalysisMessage message = new AnalysisMessage();

        message.setMessage("Hi\n");
        int characterCount = message.countNumberOfCharacters();
        assertEquals(characterCount, 3);
    }
}
