package projects;

import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize balance
        double balance = 5000.00; // Initial balance
        int choice;

        System.out.println("Welcome to the ATM Simulator!");

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2: // Deposit Money
                    System.out.print("Enter the amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " has been deposited successfully.");
                        System.out.println("Your new balance is: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 3: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " has been withdrawn successfully.");
                        System.out.println("Your new balance is: ₹" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance. Transaction failed.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                    return;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

