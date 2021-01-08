package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;

    List<NavigationPoint> navigationList = new ArrayList<>();


    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getNavigationList() {
        return navigationList;
    }

    public Robot go(int meter){
       distance += meter;
       return this;
    }
    public Robot rotate(int angle){
        azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint(){
        NavigationPoint np = new NavigationPoint(this); //nem jó megoldás
        navigationList.add(np);
        return this;
    }

   /* public Robot registerNavigationPoint(){
        NavigationPoint np = new NavigationPoint(this.distance, this.azimut);
        navigationList.add(np);
        return this;*/
    }



