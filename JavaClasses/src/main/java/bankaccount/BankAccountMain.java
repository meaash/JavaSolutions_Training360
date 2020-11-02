package bankaccount;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("123", "B1 Béla", 1000);
        BankAccount b2 = new BankAccount("456", "B2 Józsi", 1000);

        System.out.println(b1.getInfo());
        b1.deposit(1000);
        System.out.println(b1.getInfo());
        b1.transfer(b2, 500);
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
    }
}
