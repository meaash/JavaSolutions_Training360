package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionrayItem> Dictionary = new ArrayList<>();

    public void addItem(String word, List<String> translations) {

        Dictionary.add(new DictionrayItem(word, translations));

    }

   public List<String> findTranslations(String word) {
       List<String> resultList = new ArrayList<>();
       for (DictionrayItem item: Dictionary) {
           if(word.equals(item.getWord())){
               resultList.addAll(item.getTranslations());
           }
       }
       return resultList;

   }
}
