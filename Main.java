import java.util.Scanner;

// Define a class for the ATM
class ATM {
    private double balance;  // To store the balance amount
    // Constructor to initialize the balance
    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: $" + amount);
            System.out.println("Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

// Main class to run the ATM interface
public class Main {
    public static void main(String[] args) {
        // Create an ATM object with initial balance of $1000
        ATM atm = new ATM(1000);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int choice;
        double amount;

        // ATM interface menu
        do {
            System.out.println("\nATM Interface:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your balance: $" + atm.checkBalance());
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: $");
                    amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    // Deposit money
                    System.out.print("Enter amount to deposit: $");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        // Close the Scanner object
        scanner.close();
    }
}
