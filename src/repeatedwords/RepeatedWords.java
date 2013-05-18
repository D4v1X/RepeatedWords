package repeatedwords;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWords {

    private List<String> repetedWordsList;

    public RepeatedWords() {
        this.repetedWordsList = new ArrayList<>();
    }

    public String[] find(String T1, String T2) {
        String[] tokensT1 = extractWords(T1);
        String[] tokensT2 = extractWords(T2);

        for (String wordT1 : tokensT1) {//escoger
            for (String wordT2 : tokensT2) {//buscar
                if (wordT1.equals(wordT2)) {//si es igual
                    if (!repetedWordsList.contains(wordT1) && !wordT1.isEmpty()) {//si contiene
                        addRepeatedWord(wordT1);
                    }
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
}
