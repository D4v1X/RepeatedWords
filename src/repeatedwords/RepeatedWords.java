package repeatedwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedWords {

    private List<String> repetedWordsList;

    public RepeatedWords() {
        this.repetedWordsList = new ArrayList<>();
    }

    public String[] find(String Text1, String Text2) {
        List<String> wordsListText1 = Arrays.asList(extractWords(Text1));
        List<String> wordsListText2 = Arrays.asList(extractWords(Text2));

        for (String wordText1 : wordsListText1) {
            if (wordsListText2.contains(wordText1)) {
                if (!beInTheRepeatedWordsList(wordText1)) {
                    addRepeatedWord(wordText1);
                }
            }
        }
        return repetedWordsList.toArray(new String[repetedWordsList.size()]);
    }

    private String[] extractWords(String T1) {
        return T1.split("[ ,.;:]");
    }

    private void addRepeatedWord(String word) {
        this.repetedWordsList.add(word);
    }

    private boolean beInTheRepeatedWordsList(String word) {
        return repetedWordsList.contains(word) || word.isEmpty();
    }
}
