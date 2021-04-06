package com.hcl.bankbalance;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestBalanceAccount extends TestCase{
	BankAccount acc;

	public void setUptesDepositUpdatesBalance() {
		acc = new BankAccount(100);
	}

	public void tearDown() {
		acc = null;
	}

	public void testDeposit() {
		acc.deposit(100);
		assertEquals(acc.getBalance(), 200);
	}
	public void testWithdrawUpdatesBalance() {
		acc.withdraw(40);
		assertEquals(acc.getBalance(), 60);
	}

	public void testWithdrawAppliesPenaltyWhenOverdrawn() {
		acc.withdraw(120);
		assertEquals(acc.getBalance(), 20);
	}
}
