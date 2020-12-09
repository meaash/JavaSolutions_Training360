package filescanner.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLoadFromFile() {
        Library library = new Library();

        library.loadFromFile();

        assertEquals(4, library.getBookList().size());
        assertEquals("Robert C. Martin", library.getBookList().get(2).getAuthor());
    }
}