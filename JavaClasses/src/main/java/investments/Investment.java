package investments;

public class Investment {

    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }
    public double getYield(int days){
        double f = fund;
        double iR = interestRate;
        return ((f * (iR / 100))/365)*days;

    }

    public double close(int days){
        if (active)
        { active = false;
        double f = fund;
        return (f + getYield(days))*(1.0-cost);
        }
        else{
         return 0;
        }
    }

}
