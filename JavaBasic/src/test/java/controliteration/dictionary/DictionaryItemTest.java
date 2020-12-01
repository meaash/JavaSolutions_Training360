package controliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryItemTest {

    @Test
    void CreateDictionaryItem() {
        //Given
        DictionrayItem di = new DictionrayItem("apple",new ArrayList<>(
                Arrays.asList("alma")));

        //When
        di.addTranslations(new ArrayList<>(
                Arrays.asList("piros alma")));

        //Then
        assertEquals("apple", di.getWord());
        assertEquals(Arrays.asList("alma", "piros alma"), di.getTranslations());

    }

}
