package lambda;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {

    private List<BankAccount> bankAccountList;

    public BankAccounts(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public List<BankAccount> bankAccountListByNumber() {
        List<BankAccount> orderedList = new ArrayList<>(bankAccountList);

        orderedList.sort(Comparator.naturalOrder());

        return orderedList;
    }

    public List<BankAccount> bankAccountListByBalance() {
        List<BankAccount> orderedList = new ArrayList<>(bankAccountList);

        orderedList.sort(Comparator.comparing(acc -> Math.abs(acc.getBalance())));

        return orderedList;
    }
    public List<BankAccount> bankAccountListByBalanceDesc() {
        List<BankAccount> orderedList = new ArrayList<>(bankAccountList);

        orderedList.sort(Comparator.comparing(BankAccount::getBalance).reversed());

        return orderedList;
    }
    public List<BankAccount> bankAccountListByNameAndNumber() {
        List<BankAccount> orderedList = new ArrayList<BankAccount>(bankAccountList);
            Collator c = Collator.getInstance(new Locale("hu", "HU"));
        orderedList.sort(Comparator.comparing(BankAccount::getNameOfOwner,
                Comparator.nullsFirst(c))
                .thenComparing(BankAccount::getAccountNumber));

        return orderedList;
    }

}
