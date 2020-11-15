package attributes.person;

public class Address {

    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;
    private boolean primary;

    public Address(String country, String city, String streetAndNumber, String zipCode, boolean primary) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
        this.primary = primary;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean isPrimary() {
        return primary;
    }

    public String addressToString(){
        return "Country: " + country + "\n" +
                "City: " +city + "\n" +
                "Street: " + streetAndNumber + "\n" +
                "Zip: " +zipCode;
    }

}
