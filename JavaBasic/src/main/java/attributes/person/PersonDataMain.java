package attributes.person;

import java.util.Arrays;

public class PersonDataMain {
    public static void main(String[] args) {
        Person myp = new Person("Kovács Edit","123",
                new Address("HU","Budapest","Street 1","123",true));
        System.out.println(myp.personToString());

        Address secondad = new Address("HU","Dunaujvaros","Street 3","123",true);

        myp.moveTo(secondad);
        System.out.println(myp.personToString());

        for (Address item: myp.getAddressList()) {

            System.out.println(item.addressToString());
        }

    }
}
