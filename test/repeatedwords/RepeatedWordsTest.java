package repeatedwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordsTest {

    private String T1;
    private String T2;
    private RepeatedWords repeatedWords;

    public RepeatedWordsTest() {
        repeatedWords = new RepeatedWords();
    }

    public void WordsExample1() {
        T1 = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        T2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
    }

    @Test
    public void numberOfWordsRepeated() {
        WordsExample1();

        assertEquals(8, repeatedWords.find(T1, T2).length);
    }

    @Test
    public void containedOfWordsRepeated() {
        WordsExample1();
        List<String> listwords = Arrays.asList(repeatedWords.find(T1, T2));
        String[] solucion = {"acordarme", "de", "en", "lugar", "mucho", "no", "nombre", "tiempo"};
        for (String word : solucion) {
            assertTrue(listwords.contains(word));
        }
    }
}
