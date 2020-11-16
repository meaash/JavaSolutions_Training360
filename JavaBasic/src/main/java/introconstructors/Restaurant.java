package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;

    Restaurant(String name, int numberOfTables){
        this.name = name;
        this.capacity = numberOfTables*4;
        myBasicMenu();
    }

    public void myBasicMenu() {
        menu.add("leves");
        menu.add("főétel");
        menu.add("desszert");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
