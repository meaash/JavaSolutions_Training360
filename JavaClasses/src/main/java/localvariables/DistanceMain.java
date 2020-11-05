package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance myd = new Distance (5.2, true);
        System.out.println(myd.getDistancelnKm());
        System.out.println(myd.isExact());


        int i = (int) myd.getDistancelnKm();
        System.out.println(i);
}
}
