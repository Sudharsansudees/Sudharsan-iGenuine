package Bank;

public class Transaction {
    public static void printLine() {
        System.out.println();
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}

