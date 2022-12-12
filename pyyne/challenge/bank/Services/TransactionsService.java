package com.pyyne.challenge.bank.Services;


public class TransactionsService {
	public String getTransactionsText(String text, double amount, String card){
		String transaction = text + " of value " + Double.toString(amount) + " using " + card + " card";
		return transaction;
	}
}
