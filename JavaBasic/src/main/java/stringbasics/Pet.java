package stringbasics;



public class Pet {

    private String name;
    private String yearOfBirth;
    private GenderOfPet gender;
    private String regNumber;

    public Pet(String name, String yearOfBirth, GenderOfPet genderOfPet, String regNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = genderOfPet;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public GenderOfPet getGender() {
        return gender;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
