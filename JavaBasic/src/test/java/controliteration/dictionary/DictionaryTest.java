package controliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
