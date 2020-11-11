package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> Books = new ArrayList<>();

    public void addbook(String book) {
        Books.add(book);
    }

     public List<String> findAllByPrefix(String prefix){
            List<String> search = new ArrayList<>();
         for (String book: Books) {
             if(book.startsWith(prefix)){
                 search.add(book);
             }
         }
            return search;
        }

    public List<String> removeByPrefix(String prefix){
        List<String> search = findAllByPrefix(prefix);
        Books.removeAll(search);

        return Books;
    }

}
