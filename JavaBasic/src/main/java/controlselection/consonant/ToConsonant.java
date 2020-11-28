package controlselection.consonant;

import java.time.YearMonth;
import java.util.Arrays;

public class ToConsonant {

    public char nextChar(char myChar){
        char[] maganhangzo  = "aeio".toCharArray();
        char[] massalhangzo  = "bcdfghjklmnpqrstvwxyz".toCharArray();
        
        if (Arrays.asList(maganhangzo).contains(myChar)) {
            if (maganhangzo[maganhangzo.length - 1] == myChar) {
                return maganhangzo[0];
            } else {
                for (int i = 0; i < maganhangzo.length; i++) {
                    if (maganhangzo[i] == myChar) {
                        return maganhangzo[i + 1];
                    }
                }
            }
        }
        else if(Arrays.asList(massalhangzo).contains(myChar)) {
            if (maganhangzo[massalhangzo.length - 1] == myChar) {
                return massalhangzo[0];
            } else {
                for (int i = 0; i < massalhangzo.length; i++) {
                    if (massalhangzo[i] == myChar) {
                        return massalhangzo[i + 1];
                    }
                }
            }
        }

     throw new IllegalArgumentException("Nem megfelelő bemeneti paraméter");

    }
}
