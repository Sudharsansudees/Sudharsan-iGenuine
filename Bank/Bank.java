package Bank;

import java.util.Scanner;

public class Bank {
    private static User[] users = new User[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\n Welcome to OOPS Bank ");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createAccount(sc);
                        break;
                    case 2:
                        depositMoney(sc);
                        break;
                    case 3:
                        withdrawMoney(sc);
                        break;
                    case 4:
                        checkBalance(sc);
                        break;
                    case 5:
                        System.out.println("Thank you for banking with us!");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            } finally {
                Transaction.printLine();
            }
        }
    }

    static void createAccount(Scanner sc) {
        if (User.userCount >= 5) {
            System.out.println("Maximum user limit reached!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter initial deposit: ");
        double deposit = sc.nextDouble();
        System.out.print("Choose Account Type (1-Regular, 2-Premium): ");
        int type = sc.nextInt();

        User user = null;
        if (type == 1) {
            user = new RegularAccount(name, deposit);
        } else if (type == 2) {
            user = new PremiumAccount(name, deposit);
        }

        if (user != null) {
            users[User.userCount - 1] = user;
            System.out.println("Account created successfully! Account Number: " + user.getAccountNumber());
        }
    }

    static void depositMoney(Scanner sc) {
        User user = findUserByAccount(sc);
        if (user != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            if (Transaction.isValidAmount(amount)) {
                ((BankInterface) user).deposit(amount);
            } else {
                System.out.println("Invalid amount!");
            }
        }
    }

    static void withdrawMoney(Scanner sc) {
        User user = findUserByAccount(sc);
        if (user != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            try {
                ((BankInterface) user).withdraw(amount);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void checkBalance(Scanner sc) {
        User user = findUserByAccount(sc);
        if (user != null) {
            user.displayDetails();
        }
    }

    static User findUserByAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        for (User user : users) {
            if (user != null && user.getAccountNumber() == accNo) {
                return user;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}

