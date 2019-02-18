import org.junit.Assert;
import org.junit.Test;

public class PlainTextToMorseTranslatorTest {

    @Test
    public void shouldReturnSfromDicionaryTest() {
        //given
        final String signsToTranslate = "...";
        final String expectedLetter = "S";
        PlainTextMorseDictionary dictionary = new PlainTextMorseDictionary();

        //when
        String result = dictionary.getKeyFromValue(signsToTranslate);

        //then
        Assert.assertEquals(expectedLetter, result);
    }

    @Test
    public void shoulTranslatePlainTextToMorse(){
        //given
        final String textToTranslate = "Litwo ojczyzno ty moja";
        final String expextedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / - -.-- / -- --- .--- .-";
        MorseTranslator translator = new PlainTextToMorseTranslator();

        //when
        String result = translator.translate(textToTranslate);

        //then
        Assert.assertEquals(expextedResult, result);
    }


}
