package typeconversion.whichtype;

public enum Type {

    BYTE(Byte.MIN_VALUE,Byte.MAX_VALUE),
    SHORT(Short.MIN_VALUE, Short.MAX_VALUE),
    INT(Integer.MIN_VALUE, Integer.MAX_VALUE);

    private long minLongValue;
    private long maxLongValue;

    Type(long minLongValue, long maxLongValue) {
        this.minLongValue = minLongValue;
        this.maxLongValue = maxLongValue;
    }

    public long getMinLongValue() {
        return minLongValue;
    }

    public long getMaxLongValue() {
        return maxLongValue;
    }
}
