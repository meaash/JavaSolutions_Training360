package methodchain;

public class NavigationPoint {

        // int actualDistance;
        //int actualAzimut;

        Robot actualrobot; //nem jó megoldás

    public NavigationPoint(Robot actualrobot) {
        this.actualrobot = actualrobot;
    }

    public Robot getActualrobot() {
        return actualrobot;
    }

    /*   public NavigationPoint(int actualDistance, int actualAzimut) {
        this.actualDistance = actualDistance;
        this.actualAzimut = actualAzimut;
    }

    public int getActualDistance() {
        return actualDistance;
    }

    public int getActualAzimut() {
        return actualAzimut;
    }

    @Override
    public String toString() {
        return "distance: " + actualDistance +
                " azimut: " + actualAzimut;
    }*/

    @Override
    public String toString() {
        return "distance: " + actualrobot.getDistance() +
                " azimut: " + actualrobot.getAzimut() ;}
}
