package Bank;

public class PremiumAccount extends RegularAccount {
    public PremiumAccount(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    public void withdraw(double amount) throws Exception {
        if (getBalance() < amount) {
            throw new Exception("Insufficient balance!");
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal successful (Premium). New Balance: " + getBalance());
        if (getBalance() < MIN_BALANCE) {
            System.out.println("Balance below minimum!");
        }
    }

    public double getBonus() {
        return getBalance() * 0.02;
    }
}

