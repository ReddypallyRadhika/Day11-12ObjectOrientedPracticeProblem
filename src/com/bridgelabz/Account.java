/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class Account {

	private static int AccountBalance;
	private int FinalAccountBalance;
	private int withdraw;

	/**
	 * @param args
	 */
	/*
	 * Modify class Account to provide a method called debit that withdraws money
	 * from an Account. Ensure that the debit amount does not exceed the Account’s
	 * balance. If it does, the balance should be left unchanged and the method
	 * should print a message indicating ―Debit amount exceeded account
	 * balance.Modify class AccountTest to test method debit.
	 */
	public void debit() {

		Scanner input = new Scanner(System.in);
		System.out.println(" Enter withdraw money:");
		int withdraw = input.nextInt();
		if (withdraw >= AccountBalance) {
			System.out.println("Debit amount exceeded account balance");
		} else if (withdraw <= AccountBalance) {
			FinalAccountBalance = AccountBalance - withdraw;
			System.out.println("Remaining Account Balance:" + FinalAccountBalance);
		} else {
			System.out.println("Amount Debited:" + withdraw + "/-");
		}

	}

	/**
	 * @param accountBalance
	 */
	public Account(int withdraw, int accountBalance, int finalAccountBalance) {
		AccountBalance = accountBalance;
		this.withdraw = withdraw;
		FinalAccountBalance = finalAccountBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(0, 500, 0);
		account.debit();
		AccountTest accountTest = new AccountTest(0, 500, 0);

	}

}
