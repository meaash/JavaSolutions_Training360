package enumtype.unit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class UnitConverter {

   public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){

        double mysource = source.getInMm();
        double mylength = length.doubleValue();
        double sourcevalue = mysource *mylength;
        double value = sourcevalue / target.getInMm();

       BigDecimal bd1 = new BigDecimal (value);
       bd1= bd1.setScale (4, RoundingMode.UP);
       return bd1;

    }
}
