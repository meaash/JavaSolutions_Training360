package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        PrimitiveTypes pt = new PrimitiveTypes();
        pt.toBinaryString(2);
        System.out.println(pt.toBinaryString(3));
        int n = 2;
        System.out.println(Integer.toBinaryString(3));
        System.out.println(pt.toBinaryString(2).equals(Integer.toBinaryString(2)));
    }
}
