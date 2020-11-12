package debug.numbers;

import java.util.Arrays;
import java.util.List;

public class NumbersMain {
    public static void main(String[] args) {

     NumberStatistics nb = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));
     System.out.println(nb.sumPositives());
     System.out.println(nb.minDifferenceBetweenNeighbours());


      NumberStatistics nb2 =  new NumberStatistics(Arrays.asList(-3, -4));
      System.out.println(nb2.sumPositives());

      NumberStatistics nb3 = new NumberStatistics(Arrays.asList(1));
      System.out.println(nb3.minDifferenceBetweenNeighbours());



    }
}
