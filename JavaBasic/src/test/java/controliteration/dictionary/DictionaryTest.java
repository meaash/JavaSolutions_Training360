package controliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DictionaryTest {
    @Test
    void CreateDictionary() {
        //Given

        Dictionary d = new Dictionary();
        d.addItem("apple",new ArrayList<>(Arrays.asList("alma")));
        d.addItem("potato",new ArrayList<>(Arrays.asList("krumpli")));
        d.addItem("apple",new ArrayList<>(Arrays.asList("teszt")));
        d.addItem("apple",new ArrayList<>(Arrays.asList("alma")));

        //When


        //Then
        assertEquals(new ArrayList<>(Arrays.asList("alma", "teszt")), d.findTranslations("apple"));
        assertEquals(new ArrayList<>(Arrays.asList("krumpli")), d.findTranslations("potato"));
        assertEquals(2, d.getDictionaryList().size());
        assertEquals(new ArrayList<>(Arrays.asList()), d.findTranslations("teszt"));


    }
    @Test
    public void shouldFind() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("kutya", Arrays.asList("pooch", "dog"));

        List<String> translations = dictionary.findTranslations("kutya");
        assertEquals(Arrays.asList("pooch", "dog"), translations);
    }

    @Test
    public void shouldAppend() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("kutya", Arrays.asList("pooch", "dog"));
        dictionary.addItem("kutya", Collections.singletonList("dawg"));

       // dictionary.addItem("kutya", new ArrayList<>(Arrays.asList("pooch", "dog")));
       // dictionary.addItem("kutya", new ArrayList<>(Arrays.asList("dawg")));

        List<String> translations = dictionary.findTranslations("kutya");
        assertEquals(Arrays.asList("pooch", "dog", "dawg"), translations);
    }

    @Test
    public void shouldAppendOnlyOnce() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("kutya", Arrays.asList("pooch", "dog"));
        dictionary.addItem("kutya", Collections.singletonList("dawg"));
        dictionary.addItem("kutya", Collections.singletonList("dawg"));

        List<String> translations = dictionary.findTranslations("kutya");
        assertEquals(Arrays.asList("pooch", "dog", "dawg"), translations);
    }
}

