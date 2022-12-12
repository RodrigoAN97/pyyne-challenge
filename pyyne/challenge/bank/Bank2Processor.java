package com.pyyne.challenge.bank;

import java.util.LinkedList;
import java.util.List;

import com.bank2.integration.Bank2AccountSource;
import com.bank2.integration.Bank2AccountTransaction;
import com.bank2.integration.Bank2AccountTransaction.TRANSACTION_TYPES;

public class Bank2Processor extends Bank2AccountSource implements BankAdapter {

	@Override
	public Double getBankBalance() {
		return getBalance(0).getBalance();
	}

	@Override
	public String getBankCurrency() {
		return getBalance(0).getCurrency();
	}

	@Override
	public List<String> getTransactionsInfo() {
		List<Bank2AccountTransaction> transactions = getTransactions(0, null, null);
		List<String> transactionsInfo = new LinkedList<String>();
		for(Bank2AccountTransaction i: transactions) {
			String text = i.getText();
			double amount = i.getAmount();
			String card = "";
			if(i.getType() == TRANSACTION_TYPES.CREDIT) {
				card = "CREDIT";
			} else {
				card = "DEBIT";
			}
			String transaction = text + " of value " + Double.toString(amount) + " using " + card + " card";
			transactionsInfo.add(transaction);
		}
		return transactionsInfo;
	}
}
