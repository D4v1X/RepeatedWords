package repeatedwords;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordsTest {

    @Test
    public void numberOfWordsRepeated() {
        String T1 = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String T2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        assertEquals(8, RepeatedWords.find(T1, T2).length);
    }
}
