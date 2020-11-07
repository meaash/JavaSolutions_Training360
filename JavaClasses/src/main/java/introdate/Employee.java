package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    Employee(int year, int month, int day, String name){
        this.name = name;
        this.dateOfBirth = LocalDate.of(year,month,day);
        this.beginEmployment = LocalDateTime.now();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public int calculateAge() {
        //beépített Api a kor meghatározására
        //a szükséges paramétereket át is lehet adni
        LocalDate birthDate = this.getDateOfBirth();
        LocalDate currentDate = LocalDate.now();

        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
