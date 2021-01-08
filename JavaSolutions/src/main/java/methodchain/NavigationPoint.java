package methodchain;

public class NavigationPoint {

        int actualDistance;
        int actualAzimut;


    public NavigationPoint(int actualDistance, int actualAzimut) {
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
    }
}
