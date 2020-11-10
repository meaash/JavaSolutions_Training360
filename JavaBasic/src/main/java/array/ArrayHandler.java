package array;

import java.util.Arrays;

public class ArrayHandler {

    boolean contains(int[] source, int itemToFind){

        boolean contains = Arrays.asList(source).contains(itemToFind);

        return contains;

    }
    int find(int[] source, int itemToFind){
       int index = -1;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind){
               index = i;
            }
        }
        return index;
    }
}
