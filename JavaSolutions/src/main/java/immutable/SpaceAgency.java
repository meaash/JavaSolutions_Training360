package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satelliteList = new ArrayList<>();



    public void registerSatellite(Satellite satellite){
        if (satellite == null){
            throw new NullPointerException("Parameter must not be null!");
        }
        satelliteList.add(satellite);
    }
    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        return satelliteList
                .stream()
                .filter(s -> s.getRegisterIdent().equals(registerIdent)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Satellite with the given registration cannot be found!"+ registerIdent));
    }

    @Override
    public String toString() {
        return satelliteList.toString();
    }
}


