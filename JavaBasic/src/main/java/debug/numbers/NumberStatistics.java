package debug.numbers;

import java.util.List;

public class NumberStatistics {

   private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n >= 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {

            if (numbers.size() > 1){
            int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
            for (int i = 1; i < numbers.size() - 1; i++) {
                int actDifference = numbers.get(i) - numbers.get(i + 1);
                if (actDifference < minDifference && actDifference > 0) {
                    minDifference = actDifference;
                }
            }
            return minDifference;
            }
            else throw new IllegalStateException("A lista mérete 1");


    }
}
