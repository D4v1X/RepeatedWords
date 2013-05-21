package repeatedwords;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class RepeatedWordsTest {

    private RepeatedWords repeatedWords;

    public void WordsExample1() {
        String T1 = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String T2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        repeatedWords = new RepeatedWords(T1, T2);
    }

    @Test
    public void numberOfWordsRepeated() {
        WordsExample1();
        assertEquals(8, repeatedWords.find().length);
    }

    @Test
    public void containedOfWordsRepeated() {
        WordsExample1();
        List<String> listwords = Arrays.asList(repeatedWords.find());
        String[] solucion = {"acordarme", "de", "en", "lugar", "mucho", "no", "nombre", "tiempo"};
        for (String word : solucion) {
            assertTrue(listwords.contains(word));
        }
    }
}
