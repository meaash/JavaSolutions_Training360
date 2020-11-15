package attributes.person;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private  String name;
    private String identificationCard;
    private Address ad;
    private List<Address> addressList = new ArrayList<>();

    public Person(String name, String identificationCard, Address ad) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.ad = ad;
        moveTo(ad);
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void moveTo(Address newad){

        if (newad.isPrimary()){
        for (Address item: addressList) {
            item.setPrimary(false);
        }}
        addressList.add(newad);
    }

    public String personToString(){

            for (Address item: addressList) {
                if (item.isPrimary() == true){
                    this.ad = item;
                }
            }
        return "Name: " + name + " ID: "+ identificationCard + "\nAddress:\n" + ad.addressToString();
    };
}
