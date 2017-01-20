import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Dylan on 20/01/2017.
 */
public class AnalysisMessage
{
    private String message;

    public AnalysisMessage(){
        message = "";
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void createMessageFromFile() throws IOException
    {
        FileReader fr = new FileReader("D:\\Users\\Dylan\\OneDrive\\Documents\\Programming\\Java\\textual-analysis2\\text files\\jekyll.txt");
        BufferedReader textReader = new BufferedReader(fr);

        String finalOutput = "";
        String currentLine;

        while((currentLine = textReader.readLine()) != null){
            finalOutput += currentLine + "\n";
        }

        textReader.close();
        this.message = finalOutput;
    }

    public int countWords()
    {
        int wordCount = 0;
        for(int currentChar = 0; currentChar < message.length(); currentChar++){
            if(message.charAt(currentChar) == ' '){
                wordCount++;
            }
        }

        wordCount++;
        return wordCount;
    }

    public HashMap<Character, Integer> mapCharacterOccurrences()
    {
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();

        for(int currentCharacter = 0; currentCharacter < message.length(); currentCharacter++){
            if(characterMap.containsKey(message.charAt(currentCharacter)))
            {
                characterMap.put(message.charAt(currentCharacter), characterMap.get(message.charAt(currentCharacter)) + 1);
            }
            else
            {
                characterMap.put(message.charAt(currentCharacter), 1);
            }
        }

        return characterMap;
    }

    public int countNumberOfCharacters(){
        int numberOfCharacters = 0;
        for(int currentCharacter = 0; currentCharacter < message.length(); currentCharacter++){
            numberOfCharacters++;
        }

        return numberOfCharacters;
    }


    public void printCharacterMap(){

    }

    public void analyse() throws IOException
    {
        createMessageFromFile();
        int wordCount = countWords();
        int numberOfCharacters = countNumberOfCharacters();
        HashMap<Character, Integer> characterMap = mapCharacterOccurrences();

        System.out.println("Words: " + countWords());
        System.out.println("Characters: " + countNumberOfCharacters());
        System.out.println(characterMap);
    }
}
