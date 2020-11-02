package coordinatesystem;

public class CoordinateMain {

    public static void main(String[] args) {
        Point a = new Point(5,7);
        Point b = new Point(10,15);
        Point c = new Point(4,8);

        Triangle t = new Triangle(a,b,c);
        System.out.println(t.GetCoordinateInfo());
    }
}
