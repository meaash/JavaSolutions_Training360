package finalmodifier;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentleManTest {

    @Test
     void testCreate() {
        //Given
        GentleMan gentleMan = new GentleMan();

        //When
        String name = gentleMan.sayHello("John Doe");

        //Then
        assertEquals("Mr. John Doe", name);

    }
}

