package pl.edu.pwsztar;

import java.util.ArrayList;
import java.util.List;

// TODO: Prosze dokonczyc implementacje oraz testy jednostkowe
// TODO: Prosze nie zmieniac nazw metod - wszystkie inne chwyty dozwolone
// TODO: (prosze jedynie trzymac sie dokumentacji zawartej w interfejsie BankOperation)
class Bank implements BankOperation {

    private int accountNumber = 0;
    private List<Account> accounts = new ArrayList<Account>();

    public int createAccount() {
        accounts.add(new Account(accountNumber,0));
        return ++accountNumber;
    }

    public int deleteAccount(int accountNumber) {
        for(Account account: accounts){
            if(account.getId()==accountNumber){
                return account.getAccountBalance();
            }
        }
        return -1;

    }

    public boolean deposit(int accountNumber, int amount){
        for(Account account: accounts){
            if(account.getId()==accountNumber){
                account.setAccountBalance(amount);
                return true;
            }
        }
        return false;

    }

    public boolean withdraw(int accountNumber, int amount) {
        return false;
    }

    public boolean transfer(int fromAccount, int toAccount, int amount) {
        return false;
    }

    public int accountBalance(int accountNumber) {
        return 0;
    }

    public int sumAccountsBalance() {
        return 0;
    }
}
