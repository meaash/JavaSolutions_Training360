package stringbasics;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Pet> petList = new ArrayList<>();

    public void add(Pet pet){
        if(!areEquals(pet)){
            petList.add(pet);
        }

    }

    private boolean areEquals(Pet pet){
        boolean areequal = false;
        for (Pet item : petList) {
            if(item.getRegNumber().equals(pet.getRegNumber())){
                areequal = true;
            }
        }
        return areequal;

    }

    public List<Pet> getPetList() {
        return petList;
    }
}
