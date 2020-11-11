package arraylist;

import java.util.Arrays;
import java.util.List;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules c = new Capsules();
        c.addLast("zöld");
        c.addLast("kék");
        c.addLast("kék");
        c.addLast("kék");
        c.addLast("kék");
        c.addLast("rózsaszín");
        c.addFirst("sárga");
        c.addFirst("narancs");
        c.removeFirst();
        c.removeLast();
        System.out.println(c.getColors());

        List<String> mylist = c.getColors();
        mylist.clear();
        System.out.println(c.getColors());
        System.out.println(mylist);

    }
}
