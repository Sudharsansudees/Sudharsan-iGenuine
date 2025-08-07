package Bank;

public interface BankInterface {
    public void createAccount(String name, double initialDeposit);
    public void deposit(double amount);
    public void withdraw(double amount) throws Exception;
    public void displayDetails();
}
