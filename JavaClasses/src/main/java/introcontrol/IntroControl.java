package introcontrol;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number){
        return number <=10 ? number : number-10;
    }
    public String describeNumber(int number){
        return number == 0? "zero" : "not zero";
    }
    public String greetingToJoe(String name){
        return name.equals("Joe") ? "Hello Joe" : "";
    }
    public int calculateBonus(int sale){
        double bonus = 0;
        if (sale > 1000000){
            bonus = sale * 0.1;
        }
        return (int)bonus;
    }
    public int calculateConsumption(int prev, int next){
        if (prev < next){
            return next - prev;
        }
        else{
            return (9999-next)+prev;
        }
    }
    public void printNumbers(int max){
        for (int i = 0; i <= max; i++) {
                System.out.println(i);
        }
    }
    public void printNumbersBetween(int min, int max){
        if(min > 0 && max> 0)
            for (int i = min; i <= max; i++) {
                System.out.println(i);
            }
        else{
            System.out.println("nullánál nagyobb értékű paramétereket kell megadni!");
        }
    }
    public void printNumbersBetweenAnyDirection(int a, int b){
        if(a > b)
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        else{
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

}
