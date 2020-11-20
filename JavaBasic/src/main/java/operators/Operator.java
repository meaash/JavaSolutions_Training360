package operators;

public class Operator {

    public boolean isEven(int n){
        return n%2 ==0;
    }
    public int multiplyByPowerOfTwo(int num, int multiplaynum){

        return Integer.parseInt(Integer.toBinaryString(num   << multiplaynum), 2);
    }
}
