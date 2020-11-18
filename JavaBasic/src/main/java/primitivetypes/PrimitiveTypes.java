package primitivetypes;

public class PrimitiveTypes {

    public String toBinaryString(int n) {
       String sbinary = "";

        int binary[] = new int[32];
        int index = 0;
        while (n > 0) {
            binary[index++] = n % 2;
            n = n / 2;
        }
        for (int i = binary.length-1; i >=0; i--) {
            sbinary += Integer.toString(binary[i]);
        }
        return sbinary;
    }
}
