package controlselection.greetings;


import java.time.LocalTime;

public class Greetings {


    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(greetings(myObj));

    }

    public static String greetings(LocalTime myObj){

        String greeting = "hi";
        if(myObj.getHour() < 5){
            greeting = "Jó reggelt!";
        }
        else if(myObj.getHour() > 9 &&  LocalTime.parse("18:30").isAfter(myObj))
        {
            greeting = "Jó napot!";
        }
        else{
            greeting = "Jó estét!";
        }

     return greeting;
    }

}
