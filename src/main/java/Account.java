public abstract class Account {

    String name;
    long accountNumber;
    double accountBalance;
    double changeCash;

    public enum accountType{PUBL, COMP}

    public void open(String name, long accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void close(String name, long accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void add(long accountNumber, double accountBalance, double changeCash) {
        accountBalance = accountBalance + changeCash;
    }

    public void subt(long accountNumber, double accountBalance, double changeCash) {
        accountBalance = accountBalance - changeCash;
    }


}
