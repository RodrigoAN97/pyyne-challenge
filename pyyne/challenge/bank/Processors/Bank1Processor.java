package com.pyyne.challenge.bank.Processors;

import java.util.LinkedList;
import java.util.List;

import com.bank1.integration.Bank1AccountSource;
import com.bank1.integration.Bank1Transaction;
import com.pyyne.challenge.bank.BankAdapter;
import com.pyyne.challenge.bank.Services.TransactionsService;

public class Bank1Processor extends Bank1AccountSource implements BankAdapter {

	@Override
	public Double getBankBalance() {
		return getAccountBalance(0);
	}

	@Override
	public String getBankCurrency() {
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
			String transaction = new TransactionsService().getTransactionsText(text, amount, card);
			transactionsInfo.add(transaction);
		}
		return transactionsInfo;
	}

}
