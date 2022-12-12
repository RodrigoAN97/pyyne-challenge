package com.pyyne.challenge.bank;

import java.util.List;

public interface BankAdapter {
	Double getBankBalance();
	
	String getBankCurrency();
	
	List<String> getTransactionsInfo();
}
