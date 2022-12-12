package com.pyyne.challenge.bank;

import java.util.List;

import com.bank2.integration.Bank2AccountSource;

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
		// TODO Auto-generated method stub
		return null;
	}

}
