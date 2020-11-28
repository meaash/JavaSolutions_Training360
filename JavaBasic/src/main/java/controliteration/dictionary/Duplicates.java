package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 5, 3, 7, 3, 11, 2, 3, 1);

        boolean vanegyezes = false;
        int myfirstduplicatesnum = 0;
        for (int i = 1; i < list.size(); i++) {
            for (int j = i-1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    myfirstduplicatesnum = list.get(j);
                    vanegyezes = true;
                }
            }
            if(vanegyezes){
                break;
            }
        }
        System.out.println(myfirstduplicatesnum);

        //Amazon feladat stringgel;
    }
}
