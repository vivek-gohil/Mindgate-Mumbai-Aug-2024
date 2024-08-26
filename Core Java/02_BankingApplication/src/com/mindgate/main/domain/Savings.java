package com.mindgate.main.domain;

public class Savings extends Accounts {
	private double minimumBalance;
	private boolean isSalaryAccount;

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	public Savings(int accountNumber, String name, double balance, double minimumBalance, boolean isSalaryAccount) {
		super(accountNumber, name, balance);
		this.minimumBalance = minimumBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && isSalaryAccount && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		} else {
			if (amount > 0 && getBalance() - amount >= minimumBalance) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

}
