package methodparam.measuring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Measurement {

    double[] measurements;

    public Measurement(double[] measurements) {
        this.measurements = measurements;
    }

    int findFirstIndexInLimit(int lower, int upper){
       for (int i = 0; i < measurements.length; i++) {
            if(measurements[i] <upper && measurements[i] >lower){
                return i;
            }
        }
       return -1;
    }
    public double minimum(){
        double min = measurements[0];
        for (int i = 0; i < measurements.length; i++) {
            if(measurements[i] < min){
                min = measurements[i];
            }
        }
        return min;
    }

    public double maximum(){
        double max = measurements[0];
        for (int i = 0; i < measurements.length; i++) {
            if(measurements[i] > max){
                max = measurements[i];
            }
        }
        return max;
    }
    public ExtremValues minmax(){

        return new ExtremValues(minimum(), maximum());

    }
}
