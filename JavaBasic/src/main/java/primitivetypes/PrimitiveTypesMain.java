package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        PrimitiveTypes pt = new PrimitiveTypes();
        System.out.println(pt.toBinaryString(9));
        System.out.println(Integer.toBinaryString(9));
        //false! mert ez innentől string
        System.out.println(pt.toBinaryString(2).equals(Integer.toBinaryString(2)));

        //számrendszerek megadása
        System.out.println(Integer.toString(5, 2));
        System.out.println(Integer.toString(-5, 2));
        //false! mert ez innentől string
        System.out.println(Integer.toBinaryString(-5).equals(Integer.toString(-5, 2)));
        //fölösleges példányosítás az autoboxing elvégzi
        System.out.println( new Integer(2) + new Integer(1));

    }
}
