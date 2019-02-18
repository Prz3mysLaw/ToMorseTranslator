public class PlainTextToMorseTranslator implements MorseTranslator {

    private static  final String CHARACTER_SPACE = " ";
    private PlainTextMorseDictionary dictionary;

    public PlainTextToMorseTranslator(){
        this.dictionary = new PlainTextMorseDictionary();
    }


    public String translate(String textToTranslate) {

        String[] tokens = textToTranslate.split(CHARACTER_SPACE);

        StringBuilder translatedText = new StringBuilder();
        int i = 1;
        for (String token : tokens) {
            for (char character : token.toCharArray()){
                String characterString = String.valueOf(character);
                String morseCharacter = dictionary.getCharacter(characterString);
                translatedText.append(morseCharacter).append(CHARACTER_SPACE);
            }
            i++;
            if (i <= tokens.length) {
                translatedText.append("/");
            }
        }

        return translatedText.toString().trim();
    }
}
