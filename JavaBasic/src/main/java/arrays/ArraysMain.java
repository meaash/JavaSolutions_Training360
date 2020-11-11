package arrays;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static void main(String[] args) {
       String mymonth = numberOfDaysAsString();
        System.out.println(mymonth);
        /*for (String item: daysOfWeek())
        {
            System.out.println(item);
        }*/
        //a kiírás .toString() metódus nélkül is működik, a println ezt meghívja a háttérben.
        System.out.println(daysOfWeek());
        System.out.println(multiplicationTableAsString(4));
        int[] a = new int[] {1, 2, 3, 4};
        int[] b = new int[] {2, 1, 4, 3};
        System.out.println(wonLottery(a,b));
        System.out.println(Arrays.toString(b));

    }

    public static String numberOfDaysAsString() {
        String[] numberOfDays = new String[12];
        // Create a month instance
        // Month month = Month.of(1);
        // Print the maximum length of this Month
        // System.out.println(month.maxLength());

        Month month[] = Month.values(); //enum
        //System.out.println("Contents of the enum are: ");
        //Iterating enum using the for loop
        for (int i = 0; i < month.length; i++) {
            //System.out.println(month[i].name() + " " + month[i].maxLength());
            numberOfDays[i] = month[i].name() + " " + month[i].maxLength();
        }
        return Arrays.toString(numberOfDays);
    }

    public static List<String> daysOfWeek(){

        List<String> daysofweek = new ArrayList<>();

        DayOfWeek days[] = DayOfWeek.values();
        // System.out.println("Contents of the enum are: ");
        // Iterating enum using the for loop
        for(DayOfWeek day: days) {
            daysofweek.add(day.name());}

        return daysofweek;

    }

    public static String multiplicationTableAsString(int size){
        int matrix[][] = new int[size][size];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(matrix);
    }
    public static boolean sameTempValues(double[] day, double[] anotherDay){
        //paraméterként megadott két nap azonos méréseket tartalmazott-e:
            return Arrays.equals(day, anotherDay);
    }
    public static boolean wonLottery(int[] mylotto, int[] kihuzottszamok){

        int[] a = Arrays.copyOf(mylotto, 5);
        int[] b = Arrays.copyOf(kihuzottszamok, 5);
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

}
