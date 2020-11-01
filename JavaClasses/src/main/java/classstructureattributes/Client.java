package classstructureattributes;

import java.time.LocalDate;
//import java.util.Calendar;


public class Client {

    LocalDate date = LocalDate.now();

    //Calendar calendar = Calendar.getInstance();
    private String name;
    private int year ;
    private String address;
    private int age ;

    public Client(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.age = date.getYear() - this.year;
    }


    public String getClientData(){
         return ("Az ügyfél adatai:\nNeve:" + name + "\nÉletkora: " + age + "\nLakhelye:" + address);
    }
}
