package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();
        //System.out.println(ic.calculateBonus(1200000));
       // ic.printNumbers(10);
        //ic.printOddNumbers(10);
        ic.printNumbersBetweenAnyDirection(10,5);
        System.out.println("------------------------");
        ic.printNumbersBetweenAnyDirection(5,10);
    }
}
