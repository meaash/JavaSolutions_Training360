package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    List<Trooper> troopers = new ArrayList();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        troopers.add(trooper);
    }
    public void moveTrooperByName(String name, Position position){
        findTrooperByName(name).changePosition(position);
    }
    public void moveClosestTrooper(Position target){
        findClosestTrooper(target).changePosition(target);

    }

    private Trooper findTrooperByName(String name){
        return troopers
                .stream()
                .filter(s -> s.getName().equals(name)).findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Nincs ilyen név"));
    }

    private Trooper findClosestTrooper(Position target){
        double min = troopers.get(0).distanceFrom(target);
        Trooper closest = troopers.get(0);
        for (Trooper t: troopers) {
            if (t.distanceFrom(target) < min){
                min = t.distanceFrom(target);
                closest = t;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }
}
