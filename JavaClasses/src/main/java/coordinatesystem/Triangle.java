package coordinatesystem;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public String GetCoordinateInfo(){
        return ("A: " +a.getX() + "," + a.getY() + "\n" +
                "B: " +b.getX() + "," + b.getY() + "\n" +
                "C: " +c.getX() + "," + c.getY());
    }
}
