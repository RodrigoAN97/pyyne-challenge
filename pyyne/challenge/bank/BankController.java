package com.pyyne.challenge.bank;

import com.pyyne.challenge.bank.Processors.Bank1Processor;
import com.pyyne.challenge.bank.Processors.Bank2Processor;

/**
 * Controller that pulls information form multiple bank integrations and prints them to the console.
 *
 * Created by Par Renyard on 5/12/21.
 */
public class BankController {

    public void printBalances() {
    	System.out.println("BANK 1: " + new Bank1Processor().getBankBalance() + new Bank1Processor().getBankCurrency());
    	System.out.println("BANK 2: " + new Bank2Processor().getBankBalance() + new Bank2Processor().getBankCurrency());
    }

    public void printTransactions() {
    	System.out.println(new Bank1Processor().getTransactionsInfo());
    	System.out.println(new Bank2Processor().getTransactionsInfo());
    }
    
    public static void main(String[] args) {
        new BankController().printBalances();
        new BankController().printTransactions();
    }
}
