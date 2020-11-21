package typeconversion.dataloss;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DataLoss {

    public static void main(String[] args) {
        long l = 3;
        System.out.println(Long.toBinaryString(l));
        float f = 3;
        System.out.println(f);
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(f)));
        dataloss();

    }

    public static void dataloss(){

        for (int i = 1; i <=3 ; i++) {
            long l = i;
            System.out.println(i);
            System.out.println("A long értéke: "+l);
            System.out.println("A long értéke binárisan: "+ Long.toBinaryString(l));
            float f = l;
            System.out.println("A float értéke: "+f);
            String sf = Integer.toBinaryString(Float.floatToIntBits(f));
            System.out.println("A float értéke binárisan: "+ sf);
            System.out.println("float újra longra konvertálva: ");
            l = (long )f;
            System.out.println("A long értlke: "+ l);
            System.out.println("A long értéke binárisan: "+ Long.toBinaryString(l));
            System.out.println("-----------------------------");

        }


    }
}
