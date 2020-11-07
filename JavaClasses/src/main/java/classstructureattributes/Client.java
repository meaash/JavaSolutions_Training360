package classstructureattributes;

import java.time.LocalDate;
//import java.util.Calendar;


public class Client {

    //Calendar calendar = Calendar.getInstance(); //--------- régebben volt használatban

    private LocalDate date = LocalDate.now();


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
