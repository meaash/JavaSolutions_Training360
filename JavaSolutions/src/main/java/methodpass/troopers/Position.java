package methodpass.troopers;

public class Position {

    private final double posX; //ha nem adunk settert egyébként sem lesz megváltoztatható;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom (Position position){
        return Math.sqrt(Math.pow((position.posX-this.posX),2) +
                Math.pow((position.posY-this.posY),2));
    }
}
