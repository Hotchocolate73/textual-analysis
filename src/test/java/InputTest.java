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
    @Ignore
    public void createMessageFromFileSuccessfully() throws IOException
    {
        AnalysisMessage message = new AnalysisMessage();

        message.createMessageFromFile();

        assertNotEquals(message.getMessage(), "");
        //System.out.println(message.getMessage());
        System.out.println("Words: " + message.countWords());
        System.out.println("Characters: " + message.countCharacterOccurrences());
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
        int characterCount = message.countCharacterOccurrences();
        assertEquals(characterCount, 3);
    }
}
