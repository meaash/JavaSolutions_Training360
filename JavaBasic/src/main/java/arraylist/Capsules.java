package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> Colors = new ArrayList<>();


    public void addLast(String color){
        Colors.add(color);

   }
   public  void addFirst(String color){
       Colors.add(0, color);
   }
   public void removeFirst(){
       Colors.remove(0);
   }
   public void removeLast(){
        Colors.remove(Colors.size()-1);
   }

    public List<String> getColors() {
        return Colors;
    }
}
