import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Dylan on 20/01/2017.
 */
public class InputTest
{
    @Test
    public void createMessageFromFileSuccessfully(){
        AnalysisMessage message = new AnalysisMessage();

        message.createMessageFromFile();

        assertNotEquals(message.getMessage(), "");
    }
}
