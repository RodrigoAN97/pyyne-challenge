package com.pyyne.challenge.bank.Services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionsServiceTest {

	@Test
	void shouldReturnCorrectTransactionText() {
		TransactionsService transactionsService = new TransactionsService();
		assertEquals("Car of value 20000.0 using CREDIT card", transactionsService.getTransactionsText("Car", 20000, "CREDIT"));
	}
	
	@Test
	void shouldReturnCorrectTransactionTextWhenDecimal() {
		TransactionsService transactionsService = new TransactionsService();
		assertEquals("Car of value 20000.25 using CREDIT card", transactionsService.getTransactionsText("Car", 20000.25, "CREDIT"));
	}

}
