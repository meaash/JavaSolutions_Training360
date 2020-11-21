package operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {

    private int diameter;
    private double PI = Math.round(Math.PI * 100.0) / 100.0;
    //private BigDecimal PI = new BigDecimal(Double.toString(Math.PI)).setScale(2,RoundingMode.UP);


    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter(){
        double radius = diameter /2.0;
        return  2 * PI * radius;

    }

    public double area(){
        double radius = diameter /2.0;
        return PI * radius * radius;
    }

}
