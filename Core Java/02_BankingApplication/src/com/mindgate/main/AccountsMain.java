package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Accounts;

public class AccountsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Accounts accounts = new Accounts();

		double amount;
		boolean transactionResult;
		String continueChoice;
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter name");
		String name = scanner.nextLine();

		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

//		accounts.setAccountNumber(accountNumber);
//		accounts.setName(name);
//		accounts.setBalance(balance);

		Accounts accounts = new Accounts(accountNumber, name, balance);

		System.out.println("Account Number = " + accounts.getAccountNumber());
		System.out.println("Name = " + accounts.getName());
		System.out.println("Balance = " + accounts.getBalance());

		do {
			System.out.println("--------------------------------");
			System.out.println("Menu");
			System.out.println("--------------------------------");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter your choice");
			int transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				transactionResult = accounts.withdraw(amount);
				if (transactionResult) {
					System.out.println("Withdraw successfull");
					System.out.println("Updated balance " + accounts.getBalance());
				} else {
					System.out.println("Withdraw failed");
					System.out.println("Balance " + accounts.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				transactionResult = accounts.deposit(amount);
				if (transactionResult) {
					System.out.println("Deposit successfull");
					System.out.println("Updated balance " + accounts.getBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance " + accounts.getBalance());
				}
				break;
			case 3:
				System.out.println("Balance " + accounts.getBalance());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you wish to continue true/false");
			continueChoice = scanner.next();
		} while (continueChoice == "Yes");
		System.out.println("Thank You!");
		scanner.close();

	}
}
