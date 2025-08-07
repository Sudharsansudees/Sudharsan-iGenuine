package Bank;

public class RegularAccount extends User implements BankInterface {
    public static final double MIN_BALANCE = 1000;

    public RegularAccount(String name, double initialDeposit) {
        super(name, initialDeposit);

    }

    public void createAccount(String name, double initialDeposit) {

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);

        System.out.println("Deposit successful. New Balance: " + getBalance());
    }

    public void withdraw(double amount) throws Exception {
        try {
            if (getBalance() - amount < MIN_BALANCE) {
                throw new Exception("Insufficient balance!");


            }
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New Balance: " + getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayDetails() {
        System.out.println("Balance: " + getBalance());
    }
}
