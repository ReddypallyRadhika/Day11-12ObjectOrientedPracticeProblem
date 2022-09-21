/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class AccountTest {
	private int AccountBalance;
	private int withdraw;
	private int FinalAccountBalance;


	public AccountTest(int withdraw, int accountBalance, int finalAccountBalance) {

		setAccountBalance(accountBalance);
		this.setWithdraw(withdraw);
		FinalAccountBalance = finalAccountBalance;
	}

	public void setFinalAccountBalance(int FinalAccountBalance) {
		this.FinalAccountBalance = FinalAccountBalance;
	}

	public String toString() {
		return "TRemaining Account Balance:" + FinalAccountBalance;
	}

	public int getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

}