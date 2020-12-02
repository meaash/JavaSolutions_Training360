package exceptionhandling;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SsnValidator {

    public boolean isValidSsn(String ssn){
        try {
            //int value = Integer.parseInt(ssn);
           // char[] ch = ssn.toCharArray();
            int[] ints = new int[9];
            for (int i=0; i < ssn.length(); i++) {
                ints[i] = Integer.parseInt(String.valueOf(ssn.charAt(i)));
            }
            int paratlan = 0;
            int paros = 0;
            for (int i = 0; i < ints.length-1; i++) {
                if ((i+1)%2 ==1){
                   paratlan+= ints[i]*3;
                }
                else{
                    paros += ints[i]*7;
                }
            }
            int numNine = (paros+paratlan)%10;

            return numNine==ints[ints.length-1];

        } catch (NumberFormatException e) {
            return false;
        }

    }

   public int ParseSsn(String ssn) {
      return   Integer.parseInt(ssn);
    }// We now know that it's safe to parse

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
