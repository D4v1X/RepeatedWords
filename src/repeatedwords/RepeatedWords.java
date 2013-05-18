package repeatedwords;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWords {

    public static String[] find(String T1, String T2) {
        String[] tokensT1 = T1.split("[ ,.;:]");
        String[] tokensT2 = T2.split("[ ,.;:]");
        List<String> repetedWordsList = new ArrayList<>();
        
        for(String wordT1 : tokensT1){
            for (String wordT2 : tokensT2){
                if(wordT1.equals(wordT2)){
                    if(!repetedWordsList.contains(wordT1) && !wordT1.isEmpty()){
                         repetedWordsList.add(wordT1);
                    }
                }
            }
        }
        return repetedWordsList.toArray(new String[repetedWordsList.size()]); 
    }
}
