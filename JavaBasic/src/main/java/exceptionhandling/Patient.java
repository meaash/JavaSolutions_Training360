package exceptionhandling;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;
   // private SsnValidator ssnValidator = new SsnValidator();

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name.isEmpty() || yearOfBirth < 1900 || ! new SsnValidator().isValidSsn(ssn)){
            throw new IllegalArgumentException("Helytelen adatok: \nNév: " +name
                    +"\nSzületési év: "+yearOfBirth
                    +"\nTAJ: "+ssn);
        } //külön if ágakba érdemes tenni és mindegyikre külön kivételt dobni.

        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
