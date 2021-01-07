package methodvarargs;

import java.util.Arrays;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints){
        this.maxPoints = maxPoints;
    }
    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if (results == null || results.length <= 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int count = 0;
        for (int r: results) {
            if(r > maxPoints * (limitInPercent / 100.0)){
                count++;
            }
        }
        return count;

    }
    public boolean hasAnyFailed(int limitInPercent, int... results){
        if (results == null || results.length <= 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        return Arrays.stream(results)
                .anyMatch(r -> r < maxPoints * (limitInPercent / 100.0));


    }

}
