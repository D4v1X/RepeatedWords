package repeatedwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedWords {

    private List<String> repetedWordsList;
    private String sourceText1;
    private String sourceText2;
    

    public RepeatedWords(String sourceText1, String sourceText2) {
        this.sourceText1 = sourceText1;
        this.sourceText2 = sourceText2;
        this.repetedWordsList = new ArrayList<>();
    }

    public String[] find() {
        List<String> wordsListText1 = Arrays.asList(extractWords(sourceText1));
        List<String> wordsListText2 = Arrays.asList(extractWords(sourceText2));

        for (String wordText1 : wordsListText1) {
            if (wordsListText2.contains(wordText1)) {
                if (!beInTheRepeatedWordsList(wordText1)) {
                    addRepeatedWord(wordText1);
                }
            }
        }
        return repetedWordsList.toArray(new String[repetedWordsList.size()]);
    }

    private String[] extractWords(String Text) {
        return Text.split("[ ,.;:¡!¿?]");
    }

    private void addRepeatedWord(String word) {
        this.repetedWordsList.add(word);
    }

    private boolean beInTheRepeatedWordsList(String word) {
        return repetedWordsList.contains(word) || word.isEmpty();
    }
}
