package defaultconstructor.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SimpleDateFormatter {

    public SimpleDateFormatter(){

    }

    public String formatDateString(SimpleDate simpleDate){

        return  LocalDate.parse(simpleDate.toString(), DateTimeFormatter.ISO_LOCAL_DATE).toString();
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        LocalDate parsedDate= LocalDate.of(simpleDate.getYear(),simpleDate.getMonth(),simpleDate.getDay());
        String myDate = "";
        //formatter osztályok dátumok formázására:
        //SimpleDateformatterrel a nullát ki lehet venni a hónapok napok elől
        // SimpleDateFormat formatter = new SimpleDateFormat("EEEE', 'MMMM dd', ' yyyy");
        //LocalDate.parse(parsedDate.toString(), DateTimeFormatter.ofPattern("dd-M-yyyy"));

        switch (countryCode){
             case HU -> myDate = new SimpleDateFormat("yyyy-M-d").format(Date.from(parsedDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
             case EN -> parsedDate = LocalDate.parse(parsedDate.toString(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
             case US -> parsedDate = LocalDate.parse(parsedDate.toString(), DateTimeFormatter.ofPattern("MM-dd-yyyy"));
         }
         return myDate;
    }
}
