package enumtype.unit;

import java.math.BigDecimal;

public class UnitConverterMain {

    public static void main(String[] args) {

        System.out.println(new UnitConverter().convert(new BigDecimal(2.000000),LengthUnit.CENTIMETER, LengthUnit.METER));
    }
}
