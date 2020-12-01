package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionrayItem {

    private String word;
    private List<String> translations; //= new ArrayList<>() nem kell mert így redundant;

    public DictionrayItem(String word, List<String> translations) {
        this.word = word;
        this.translations = translations;
    }

    public void addTranslations(List<String> newTranslations){
        for (String item: newTranslations) {
            if(!translations.contains(item)){
                translations.add(item);
            }
        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}

