public class BankAccBuilder {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccBuilder() {
    }

    // builder pattern methods
    public BankAccount buildAccount() {
        return new BankAccount(accountNumber,
                owner,
                branch,
                balance,
                interestRate);
    }

    public BankAccBuilder setAccNum(long accNum) {
        this.accountNumber = accNum;
        return this;
    }

    public BankAccBuilder setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public BankAccBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public BankAccBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccBuilder setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

}
