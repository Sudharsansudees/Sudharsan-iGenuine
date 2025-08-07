import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 5000;
        int attempts = 0;

        
        

       
        while (attempts < 3) {
            System.out.print("Enter 4 digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("PIN verified");
                
                
                while (true) {
                    System.out.println("\n1. Withdraw");
                    System.out.println("2. Check Balance");
                    System.out.println("3. Exit");
                    System.out.print("Choose an option: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter amount to withdraw: ");
                        int amount = sc.nextInt();
                        

                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println("Please collect your cash");
                            System.out.println("Remaining Balance: " + balance);
                        } else {
                            System.out.println("Insufficient Balance or Invalid Amount");
                        }
                    } else if (choice == 2) {
                        System.out.println("Available Balance: " + balance);
                    } else if (choice == 3) {
                        System.out.println("Thank you for using");
                        break;
                    } else {
                        System.out.println("Invalid Try Again");
                    }
                }

                break; 
            } else {
                attempts++;
                if (attempts == 3) {
                    System.out.println(" Card Blocked.");
                } else {
                    System.out.println("Wrong PIN. Attempts left: " + (3 - attempts));
                }
            }
        }
    }
}
