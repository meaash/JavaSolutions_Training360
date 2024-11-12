package controliteration.dictionary;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {

    // Returns index of the first occurrence of target
    static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    // Returns index just past the last occurrence of target
    static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    // Function to return elements that occur in arr more than once
    static List<Integer> findDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            int first = lowerBound(arr, arr[i]);
            int last = upperBound(arr, arr[i]) - 1;

            // If the element occurs more than once, add it to res
            if (last > first) {
                res.add(arr[i]);
            }

            // Update i to the last index of the current element
            i = last + 1;
        }
        return res;
    }
    static List<Integer> findDuplicatesMap(List<Integer> arr) {

        // Find frequency of every element
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Move all those elements to result that
        // have frequency more than 1.
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        List<Integer> res = findDuplicates(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }

        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> res2 = findDuplicatesMap(arrList);
        for (int x : res2) {
            System.out.print(x + " ");
        }

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
