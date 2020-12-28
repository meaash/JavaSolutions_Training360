package immutable;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private final String registerIdent;

    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)){
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.destinationCoordinates = celestialCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
     destinationCoordinates = new CelestialCoordinates(destinationCoordinates.getX() + diff.getX(),
        destinationCoordinates.getY()+diff.getY(), destinationCoordinates.getZ()+diff.getZ()) ;
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }
    private boolean isEmpty(String str){
        return (str == null || str.isEmpty());
    }

    @Override
    public String toString() {
        return registerIdent +
                ": " + destinationCoordinates;
    }
}
