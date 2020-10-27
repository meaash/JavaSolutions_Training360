package classstructureattributes;

import java.util.Calendar;

public class Client {

    Calendar calendar = Calendar.getInstance();
    private String name;
    private int year;
    private String address;
    private int age ;

    public Client(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.age = calendar.get(Calendar.YEAR) - this.year;
    }


    public String getClientData(){
         return ("Az ügyfél adatai:\nNeve:" + name + "\nÉletkora: " + age + "\nLakhelye:" + address);
    }
}
