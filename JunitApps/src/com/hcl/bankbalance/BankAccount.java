package com.hcl.bankbalance;
public class BankAccount {
private int balance;
public BankAccount(int bal) {
	balance=bal;
}
public BankAccount() {
	balance=0;
}
public int getBalance() {
	return balance;
}
public void deposit(int amount) {
	balance+=amount;
}
public void withdraw(int amount) {
	balance-=amount;
}
}
