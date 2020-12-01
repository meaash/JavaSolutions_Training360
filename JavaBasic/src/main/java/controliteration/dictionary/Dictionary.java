package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionrayItem> DictionaryList = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        if (!containsWord(word)){
        DictionaryList.add(new DictionrayItem(word, translations));}
        else{
                    getDictionaryItem(word).addTranslations(translations);
            }
        }

    private DictionrayItem getDictionaryItem(String word){
        for (DictionrayItem di:getDictionaryList()) {
            if(di.getWord().equals(word)){
                return di;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen szó a szótárban");
    }
    private boolean containsWord(String word) {
        //like Linq Any (boolean exists)
        return DictionaryList
                .stream()
                .anyMatch(s -> s.getWord().contains(word));

        /*boolean exists = false;
        for (DictionrayItem item : DictionaryList) {
            if (word.equals(item.getWord())) {
                exists = true;
            }
        }
        return exists;*/
    }


   public List<String> findTranslations(String word) {
       List<String> resultList = new ArrayList<>();
       for (DictionrayItem item: DictionaryList) {
           if(word.equals(item.getWord())){
               resultList.addAll(item.getTranslations());
           }
       }
       return resultList;

   }

    public List<DictionrayItem> getDictionaryList() {
        return DictionaryList;
    }
}
