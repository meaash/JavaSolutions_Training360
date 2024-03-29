package game;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance(Point other){

        return Math.sqrt(Math.pow((other.x-this.x),2) +
                Math.pow((other.y-this.y),2));

    }

    @Override
    public String toString() {
        return  x +
                "," + y;
    }
}
