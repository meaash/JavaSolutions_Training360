package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("---------integer------------");
        String osszefuzes = "1" +"2";
        System.out.println(osszefuzes);
        double quotient = 3/4;
        System.out.println(quotient);
        double d = 3/4d;
        System.out.println(d);
        float f = 3/4f;
        System.out.println(f);
        long big =  3_244_444_444L;
        System.out.println(big);


        System.out.println("---------string------------");

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);
        String word = "title";
        System.out.println(word.toUpperCase());

        System.out.println("---------binairies------------");
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));



    }

}
