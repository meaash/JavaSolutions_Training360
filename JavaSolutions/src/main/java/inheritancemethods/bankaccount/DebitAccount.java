package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private static final double PERCENT = 3.0;
    private static final long MIN_COST = 200;




    public DebitAccount(String accountNumber, long balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        return (amount * PERCENT / 100.0) <= MIN_COST ? MIN_COST : (long) (amount * PERCENT / 100.0);
    }
    public boolean transaction(long amount) {
        long trx = amount + costOfTransaction(amount);
        if (trx <= balance) {
            balance -= trx;
            return true;
        }
        return false;
    }
    public void balanceToZero(){balance = 0;}

     // az egyenleget nullázza le, túlköltés esetén
}
