package enumtype.unit;

public enum LengthUnit {

    MILIMETER(false,1.0),
    CENTIMETER(false,10.0),
    METER(true, 1000.0),
    YARD(false,914.0),
    FOOT(false,304.8),
    INCH(false,25.4);

    private final boolean SIunit;
    private final double inMm;

    LengthUnit(boolean SIunit, double inMm) {
        this.SIunit = SIunit;
        this.inMm = inMm;
    }

    public boolean isSIunit() {
        return SIunit;
    }

    public double getInMm() {
        return inMm;
    }
}
