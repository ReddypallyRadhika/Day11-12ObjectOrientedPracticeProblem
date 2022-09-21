/**
 * 
 */
package com.bridgelabz;


import java.util.Scanner;

/**
 * @author hp
 *
 */
public class StockPortFolio {

	/**
	 * @param args
	 */
	/*
	 * -> Write a program to read in Stock Names, Number of Share, Share Price.Print
	 * a Stock Report with the total value of each Stock and the total value of
	 * Stock.
	 */

	int numberOfStock;
	String shareName;
	int numberOfShare;
	double sharePrice;
	private double valueOfEachStock;
	private double valueOfTotalStocks;

	public void StockPortfolio() {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter No. Of Stok:");
		int numberOfStock = input.nextInt();

		for (int i = 0; i < numberOfStock; i++)
		{
			System.out.println(" Enter Stok:");
			int Stock = input.nextInt();
			System.out.println("share Name:");
			String shareName = input.next();
			;
			System.out.println("No. of Shares:");
			int numberOfShare = input.nextInt();
			System.out.println("Share Price:");
			double sharePrice = input.nextLong();
			double valueOfEachStock = numberOfShare * sharePrice;
			System.out.println("Value of each stock:" + valueOfEachStock);
			valueOfTotalStocks += valueOfEachStock;

		}

		System.out.println("Value of Total stock:" + valueOfTotalStocks);
	}

	public double getValueOfEachStock() {
		return valueOfEachStock;
	}

	public void setValueOfEachStock(double valueOfEachStock) {
		this.valueOfEachStock = valueOfEachStock;
	}

	public double getvalueOfTotalStocks() {
		return valueOfEachStock;
	}

	public void setvalueOfTotalStocks(double valueOfTotalStocks) {
		this.valueOfTotalStocks = valueOfTotalStocks;
	}

}
