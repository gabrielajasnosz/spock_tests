package pl.edu.pwsztar;

public class Account {

    private int id;


    private int accountBalance;


    public Account(int id, int accountBalance) {
        this.id = id;
        this.accountBalance = accountBalance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }







}
