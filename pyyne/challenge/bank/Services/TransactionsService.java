package com.pyyne.challenge.bank.Services;


public class TransactionsService {
	public String getTransactionsText(String text, double amount, boolean isCredit){
		String cardType = "";
		if(isCredit) {
			cardType = "credit";
		} else {
			cardType = "debit";
		}
		
		String transaction = text + " of value " + Double.toString(amount) + " using " + cardType + " card";
		return transaction;
	}
}
