package com.pyyne.challenge.bank;

import java.util.List;

public interface BankAdapter {
	Double getBalance();
	
	String getCurrency();
	
	List<String> getTransactionsInfo();
}
