package com.pyyne.challenge.bank;

import java.util.LinkedList;
import java.util.List;

import com.bank1.integration.Bank1AccountSource;
import com.bank1.integration.Bank1Transaction;

public class Bank1Processor extends Bank1AccountSource implements BankAdapter {

	@Override
	public Double getBalance() {
		return getAccountBalance(0);
	}

	@Override
	public String getCurrency() {
		return getAccountCurrency(0);
	}

	@Override
	public List<String> getTransactionsInfo() {
		List<Bank1Transaction> transactions = getTransactions(0, null, null);
		List<String> transactionsInfo = new LinkedList<String>();
		for(Bank1Transaction i: transactions) {
			String text = i.getText();
			double amount = i.getAmount();
			String card = "";
			if(i.getType() == 1) {
				card = "CREDIT";
			} else {
				card = "DEBIT";
			}
			String transaction = text + "of value" + Double.toString(amount) + "using" + card + "card";
			transactionsInfo.add(transaction);
		}
		return transactionsInfo;
	}

}
