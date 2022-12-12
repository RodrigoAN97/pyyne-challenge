package com.pyyne.challenge.bank;

import java.util.List;

import com.bank2.integration.Bank2AccountSource;

public class Bank2Processor extends Bank2AccountSource implements BankAdapter {

	@Override
	public Double getBalance() {
		return getBalance();
	}

	@Override
	public String getCurrency() {
		return getCurrency();
	}

	@Override
	public List<String> getTransactionsInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
