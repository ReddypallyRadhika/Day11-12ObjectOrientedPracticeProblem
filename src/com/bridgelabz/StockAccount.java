/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class StockAccount {

	/**
	 * @param args
	 */
	/*
	 * processing - StockAccount.java implements a data type that might be used by a financial institution to keep track of customer information.
	 * The StockAccount class also maintains a list of CompanyShares objects which have Stock Symbol and Number of Shares as well as 
	 * DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are available and accordingly update or create an Object.
	 */
	 private final String name;     // customer name
	    private double cash;           // cash balance
	    private int n;                 // number of stocks in portfolio
	    private int[] shares;          // shares[i] = number of shares of stock i
	    private String[] stocks;       // stocks[i] = symbol of stock i

	    // build data from file
	    public StockAccount(String filename) {
	       Scanner in = new Scanner(filename);
	        name = in.nextLine();
	        cash = in.nextDouble();
	        n = in.nextInt();
	        shares = new int[n];
	        stocks = new String[n];
	        for (int i = 0; i < n; i++) {
	            shares[i] = in.nextInt();
	            stocks[i] = in.next();
	        }
	    }

	    /**
		 * @param name
		 * @param cash
		 * @param n
		 * @param shares
		 * @param stocks
		 */
		public StockAccount(String name, double cash, int n, int[] shares, String[] stocks) {
			super();
			this.name = name;
			this.cash = cash;
			this.n = n;
			this.shares = shares;
			this.stocks = stocks;
		}

		// print a report to standard output
	    public void printReport() {
	        System.out.println(name);
	        double total = cash;
	        for (int i = 0; i < n; i++) {
	            int amount = shares[i];
	           // double price = stocks.length;
	            double price = Stock.priceOf(stocks[i]);
	            total += amount * price;
	            System.out.printf("%4d %5s ", amount, stocks[i]);
	            System.out.printf("%9.2f %11.2f\n", price, amount * price);
	        }
	        System.out.printf("%21s %10.2f\n", "Cash: ", cash);
	        System.out.printf("%21s %10.2f\n", "Total:", total);
	    }
	 /*  public void buy(int amount ,String symbol)
	    {
		   amount=shares+amount;
	    }

	  public  void sell(int amount,String symbol)
	    {
		  amount=shares-amount;
	    }
*/
	    // value of account
	    public double valueOf() {
	        System.out.println(name);
	        double total = cash;
	        for (int i = 0; i < n; i++) {
	            int amount = shares[i];
	            double price = Stock.priceOf(stocks[i]);
	            total += amount * price;
	        }
	        return total;
	    }


	    // test client
	    public static void main(String[] args) {

	        StockAccount account = new StockAccount("name");
	        account.printReport();
	    }
	}
